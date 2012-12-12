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
package com.ibm.batch.container.artifact.proxy;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

import javax.batch.annotation.AfterJob;
import javax.batch.annotation.BeforeJob;

import jsr352.batch.jsl.Property;

import com.ibm.batch.container.exception.BatchContainerRuntimeException;

public class JobListenerProxy extends AbstractProxy {

    private Method afterJobMethod = null;
    private Method beforeJobMethod = null;


    JobListenerProxy(Object delegate, List<Property> props) { 
        super(delegate, props);

        //find annotations: beforeJob, afterJob
        for (Method method: delegate.getClass().getDeclaredMethods()) { 
            Annotation beforeJob= method.getAnnotation(BeforeJob.class);
            if ( beforeJob != null ) { 
                beforeJobMethod= method;
            }
            
            Annotation afterJob= method.getAnnotation(AfterJob.class);
            if ( afterJob != null ) { 
                afterJobMethod = method;
            }

        }
        
    }

    public void beforeJob() {
        if ( beforeJobMethod != null ) {
            try {
                beforeJobMethod.invoke(delegate, (Object[]) null);
            } catch (Exception e) {
                throw new BatchContainerRuntimeException(e);
            }
        }
    }

    public void afterJob() {
        if ( afterJobMethod != null ) {
            try {
                afterJobMethod.invoke(delegate, (Object[]) null);
            } catch (Exception e) {
                throw new BatchContainerRuntimeException(e);
            }
        }
    }
    
}


