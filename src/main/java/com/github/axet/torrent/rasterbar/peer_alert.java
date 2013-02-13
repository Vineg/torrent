package com.github.axet.torrent.rasterbar;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;
/**
 * <i>native declaration : c/libtorrent.h:403</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class peer_alert extends Structure {
	/// C type : torrent_alert
	public torrent_alert torrent_alert;
	/// C type : endpoint
	public endpoint ip;
	public int pid;
	public peer_alert() {
		super();
	}
    @Override
    protected List getFieldOrder() {
        return Arrays.asList(new String[]{"torrent_alert", "ip", "pid"});
	}
	/**
	 * @param torrent_alert C type : torrent_alert<br>
	 * @param ip C type : endpoint
	 */
	public peer_alert(torrent_alert torrent_alert, endpoint ip, int pid) {
		super();
		this.torrent_alert = torrent_alert;
		this.ip = ip;
		this.pid = pid;
	}
	public static class ByReference extends peer_alert implements Structure.ByReference {
		
	};
	public static class ByValue extends peer_alert implements Structure.ByValue {
		
	};
}
