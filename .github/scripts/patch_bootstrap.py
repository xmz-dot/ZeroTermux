import os
import sys
import time

def main():
    start_time = time.time()
    print("=" * 60)
    print("[patch_bootstrap] 开始补丁流程")
    print(f"[patch_bootstrap] 工作目录: {os.getcwd()}")
    print(f"[patch_bootstrap] Python 版本: {sys.version}")
    print("=" * 60)

    archs = ["aarch64", "arm", "i686", "x86_64"]
    patched_count = 0
    skipped_count = 0
    missing_count = 0

    for arch in archs:
        path = f"app/src/main/cpp/bootstrap-{arch}.zip"
        print(f"\n--- 处理架构: {arch} ---")
        print(f"  目标文件: {path}")

        if os.path.exists(path):
            file_size = os.path.getsize(path)
            print(f"  文件大小: {file_size:,} bytes ({file_size / 1024 / 1024:.2f} MB)")

            with open(path, "rb") as f:
                data = f.read()

            count = data.count(b"com.termux")
            print(f"  匹配到 'com.termux' 出现次数: {count}")

            if count > 0:
                data = data.replace(b"com.termux", b"com.tarmux")
                with open(path, "wb") as f:
                    f.write(data)
                new_size = os.path.getsize(path)
                print(f"  ✅ 已替换 {count} 处 'com.termux' -> 'com.tarmux'")
                print(f"  写入后文件大小: {new_size:,} bytes")
                patched_count += 1
            else:
                print(f"  ⚠️ 未找到 'com.termux'，无需补丁")
                skipped_count += 1
        else:
            print(f"  ❌ 文件不存在，跳过")
            missing_count += 1

    elapsed = time.time() - start_time
    print("\n" + "=" * 60)
    print("[patch_bootstrap] 补丁流程完成")
    print(f"  总计架构数: {len(archs)}")
    print(f"  已补丁: {patched_count}")
    print(f"  已跳过(无需补丁): {skipped_count}")
    print(f"  文件缺失: {missing_count}")
    print(f"  耗时: {elapsed:.3f}s")
    print("=" * 60)

if __name__ == "__main__":
    main()
