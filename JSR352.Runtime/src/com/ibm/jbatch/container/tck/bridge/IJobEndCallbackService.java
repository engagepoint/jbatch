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
package com.ibm.jbatch.container.tck.bridge;

import com.ibm.jbatch.spi.services.IBatchServiceBase;
import com.ibm.jbatch.tck.spi.JobEndCallbackManager;

// TODO: a better name might be ICallbackManagerService
public interface IJobEndCallbackService extends IBatchServiceBase, JobEndCallbackManager {

	public void done(long jobExecutionId);
}
