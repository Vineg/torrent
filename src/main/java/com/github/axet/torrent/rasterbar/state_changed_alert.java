package com.github.axet.torrent.rasterbar;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;
/**
 * <i>native declaration : c/libtorrent.h:486</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class state_changed_alert extends Structure {
	/// C type : torrent_alert
	public torrent_alert torrent_alert;
	/**
	 * @see state_t<br>
	 * C type : state_t
	 */
	public int state;
	/**
	 * @see state_t<br>
	 * C type : state_t
	 */
	public int prev_state;
	public state_changed_alert() {
		super();
	}
    @Override
    protected List getFieldOrder() {
        return Arrays.asList(new String[]{"torrent_alert", "state", "prev_state"});
	}
	/**
	 * @param torrent_alert C type : torrent_alert<br>
	 * @param state @see state_t<br>
	 * C type : state_t<br>
	 * @param prev_state @see state_t<br>
	 * C type : state_t
	 */
	public state_changed_alert(torrent_alert torrent_alert, int state, int prev_state) {
		super();
		this.torrent_alert = torrent_alert;
		this.state = state;
		this.prev_state = prev_state;
	}
	public static class ByReference extends state_changed_alert implements Structure.ByReference {
		
	};
	public static class ByValue extends state_changed_alert implements Structure.ByValue {
		
	};
}
