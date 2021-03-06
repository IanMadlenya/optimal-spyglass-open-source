package org.timothygray.SimpleLog;


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


/**
 * Logger for testing purposes
 */
public class TestLogger implements Logger {

    public void debug(String message) {
        logTo(message, logType.DEBUG);
    }

    public void warn(String message) {
        logTo(message, logType.WARN);
    }

    public void error(String message) {
        logTo(message, logType.ERROR);
    }

    public void info(String message) {
        logTo(message, logType.INFO);
    }

    private void logTo(String message, logType l) {
        write(message, l);
    }

    private void write(String text, logType logType) {
        System.out.println("[" + logType + "]: " + text);
    }

}
