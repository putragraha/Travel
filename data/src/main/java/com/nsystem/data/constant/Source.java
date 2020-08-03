package com.nsystem.data.constant;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import androidx.annotation.StringDef;

/**
 * @author Putra Nugraha
 * @version Source, v 0.0.1 19/07/20 15.27 by Putra Nugraha
 */
@StringDef({Source.MOCK, Source.NETWORK})
@Retention(RetentionPolicy.SOURCE)
public @interface Source {

    String MOCK = "mock";

    String NETWORK = "network";
}
