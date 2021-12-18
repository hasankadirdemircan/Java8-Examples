package com.hkdemircan.listresourcebundle;

import java.util.ListResourceBundle;

public class Message_tr extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] { { "key1", "Merhaba , hos geldiniz!" }, { "key2", "Hoscakalin!" } };
	}

}

// public abstract class ListResourceBundle extends ResourceBundle
// abstract protected Object[][] getContents();