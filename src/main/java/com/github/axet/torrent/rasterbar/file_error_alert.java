package com.github.axet.torrent.rasterbar;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * <i>native declaration : c/libtorrent.h:350</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class file_error_alert extends Structure {
	/// C type : torrent_alert
	public torrent_alert torrent_alert;
	/// C type : const char*
	public Pointer file;
	/// C type : error_code
	public error_code error;
	public file_error_alert() {
		super();
	}
    @Override
    protected List getFieldOrder() {
        return Arrays.asList(new String[]{"torrent_alert", "file", "error"});
	}
	/**
	 * @param torrent_alert C type : torrent_alert<br>
	 * @param file C type : const char*<br>
	 * @param error C type : error_code
	 */
	public file_error_alert(torrent_alert torrent_alert, Pointer file, error_code error) {
		super();
		this.torrent_alert = torrent_alert;
		this.file = file;
		this.error = error;
	}
	public static class ByReference extends file_error_alert implements Structure.ByReference {
		
	};
	public static class ByValue extends file_error_alert implements Structure.ByValue {
		
	};
}
