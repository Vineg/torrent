package com.github.axet.torrent.rasterbar;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;
/**
 * <i>native declaration : c/libtorrent.h:427</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class invalid_request_alert extends Structure {
	/// C type : peer_alert
	public peer_alert peer_alert;
	/// C type : peer_request
	public peer_request request;
	public invalid_request_alert() {
		super();
	}
    @Override
    protected List getFieldOrder() {
        return Arrays.asList(new String[]{"peer_alert", "request"});
	}
	/**
	 * @param peer_alert C type : peer_alert<br>
	 * @param request C type : peer_request
	 */
	public invalid_request_alert(peer_alert peer_alert, peer_request request) {
		super();
		this.peer_alert = peer_alert;
		this.request = request;
	}
	public static class ByReference extends invalid_request_alert implements Structure.ByReference {
		
	};
	public static class ByValue extends invalid_request_alert implements Structure.ByValue {
		
	};
}
