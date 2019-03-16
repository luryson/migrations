/**
 *    Copyright 2010-2019 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.migration.options;

import java.io.File;

import static org.apache.ibatis.migration.utils.Util.file;

public class SelectedPaths {
  private File basePath = new File("./");
  private File envPath;
  private File scriptPath;
  private File driverPath;
  private File hookPath;

  public File getBasePath() {
    return basePath;
  }

  public void setBasePath(File aBasePath) {
    basePath = aBasePath;
  }

  public File getEnvPath() {
    return envPath == null ? file(basePath, "./environments") : envPath;
  }

  public void setEnvPath(File aEnvPath) {
    envPath = aEnvPath;
  }

  public File getScriptPath() {
    return scriptPath == null ? file(basePath, "./scripts") : scriptPath;
  }

  public void setScriptPath(File aScriptPath) {
    scriptPath = aScriptPath;
  }

  public File getDriverPath() {
    return driverPath == null ? file(basePath, "./drivers") : driverPath;
  }

  public void setDriverPath(File aDriverPath) {
    driverPath = aDriverPath;
  }

  public File getHookPath() {
    return hookPath == null ? file(basePath, "./hooks") : hookPath;
  }

  public void setHookPath(File aHookPath) {
    hookPath = aHookPath;
  }
}
