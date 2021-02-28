package org.hello;

import java.io.IOException;

import com.github.dtmo.jfiglet.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FigletRenderer figletRenderer = new FigletRenderer(FigFontResources.loadFigFontResource(FigFontResources.STANDARD_FLF));
        System.out.println(figletRenderer.renderText("Hello, World!"));
    }

}
