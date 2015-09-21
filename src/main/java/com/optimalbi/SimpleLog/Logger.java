package com.optimalbi.SimpleLog;


/*
   Copyright 2015 OptimalBI

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */


import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Interface for a very simple way of creating log output to GUI's and/or files
 */
public interface Logger {

    public static final List<logType> logTypesList = new ArrayList<logType>(asList(logType.DEBUG, logType.INFO, logType.WARN, logType.ERROR));

    public void debug(String message);

    public void warn(String message);

    public void error(String message);

    public void info(String message);

    public static enum logType {
        DEBUG, INFO, WARN, ERROR
    }
}
