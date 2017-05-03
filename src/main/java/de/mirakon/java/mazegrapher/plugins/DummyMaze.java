/*
 * Copyright 2017 Michael
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.mirakon.java.mazegrapher.plugins;

import de.mirakon.java.mazegrapher.main.AbstractMaze;
import de.mirakon.java.mazegrapher.main.Maze;
import org.jetbrains.annotations.NotNull;

public class DummyMaze extends AbstractMaze {

    private static final String MAZE_NAME = "Dummy Maze";
    private static final String MAZE_CATEGORY = "Dummy Mazes";

    public DummyMaze() {
        super();
    }

    @Override
    @NotNull
    public Maze newInstance() {
        return new DummyMaze();
    }

    @Override
    @NotNull
    public String getMazeCategory() {
        return MAZE_CATEGORY;
    }

    @Override
    @NotNull
    public String getMazeName() {
        return MAZE_NAME;
    }

    @Override
    @NotNull
    public String getMazePlugin() {
        return "default";
    }
}