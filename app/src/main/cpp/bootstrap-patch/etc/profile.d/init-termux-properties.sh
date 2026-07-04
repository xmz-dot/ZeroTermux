if [ ! -f /data/data/com.tarmux/files/home/.config/termux/termux.properties ] && [ ! -e /data/data/com.tarmux/files/home/.termux/termux.properties ]; then
	mkdir -p /data/data/com.tarmux/files/home/.termux
	cp /data/data/com.tarmux/files/usr/share/examples/termux/termux.properties /data/data/com.tarmux/files/home/.termux/
fi
