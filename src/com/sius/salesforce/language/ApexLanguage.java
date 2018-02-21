package com.sius.salesforce.language;

import com.intellij.lang.Language;

public class ApexLanguage extends Language {

    public static final ApexLanguage INSTANCE = new ApexLanguage();

    public ApexLanguage() {
        super("Apex");
    }
}
