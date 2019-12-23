/*
 * Copyright (c) ADSTERRA.com - All rights reserved to AD MARKET LIMITED
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written 2019
 */

package com.adsterra.domains.search;

import java.io.IOException;
import org.takes.http.Exit;
import org.takes.http.FtCli;
import org.takes.tk.TkText;

/**
 * Main app.
 * @since 0.1.0
 */
@SuppressWarnings("PMD.UseUtilityClass")
public final class App {

    /**
     * Ctor.
     */
    private App() {
    }

    /**
     * Main function.
     * @param args Arguments
     * @throws IOException if fail
     */
    public static void main(final String... args) throws IOException {
        new FtCli(
            new TkText("Hello World"),
            args
        ).start(
            Exit.NEVER
        );
    }
}
