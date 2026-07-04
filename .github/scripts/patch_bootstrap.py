import os

for arch in ["aarch64", "arm", "i686", "x86_64"]:
    path = f"app/src/main/cpp/bootstrap-{arch}.zip"
    if os.path.exists(path):
        with open(path, "rb") as f:
            data = f.read()
        count = data.count(b"com.termux")
        if count > 0:
            data = data.replace(b"com.termux", b"com.tarmux")
            with open(path, "wb") as f:
                f.write(data)
            print(f"  ✅ {arch}: patched {count} occurrences")
        else:
            print(f"  ⚠️ {arch}: no com.termux found")
    else:
        print(f"  ❌ {path} not found")
