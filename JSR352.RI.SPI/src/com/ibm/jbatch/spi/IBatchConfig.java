/*
 * Copyright 2012 International Business Machines Corp.
 * 
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership. Licensed under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package com.ibm.jbatch.spi;

import java.util.Properties;

//All configuration data related to the batch container


/**
 * Only getters are provided here since the fields will be set in 
 * specially-defined ways.
 */
public interface IBatchConfig {
	public boolean isJ2seMode();
	public DatabaseConfigurationBean getDatabaseConfigurationBean();
	public Properties getConfigProperties();
}
