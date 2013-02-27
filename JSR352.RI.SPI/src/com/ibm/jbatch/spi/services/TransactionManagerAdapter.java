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
package com.ibm.jbatch.spi.services;

/**
 * We have this interface so that we do not try to load the 
 * Java EE UserTransaction in a JSE environment
 */
public interface TransactionManagerAdapter {
	/**
	* Create a new transaction and associate it with
	* the current thread.
	* @throws Exception Thrown if the transaction
	* manager encounters an unexpected error condition.
	*/
	public void begin() throws Exception;
	/**
	* Complete the transaction associated with the
	* current thread.
	* @throws Exception Thrown if the transaction
	* manager encounters an unexpected error condition.
	*/
	public void commit() throws Exception;
	/**
	* Obtain the status of the transaction associated
	* with the current thread.
	* @return The transaction status.
	* @throws Exception Thrown if the transaction
	* manager encounters an unexpected error condition.
	*/
	public int getStatus() throws Exception;
	/**
	* Roll back the transaction associated with the
	* current thread. When this method completes,
	* the thread becomes associated with no transaction.
	* @throws Exception Thrown if the transaction manager
	* encounters an unexpected error condition.
	*/
	public void rollback() throws Exception;
	/**
	* Modify the transaction associated with the current
	* thread such that the only possible outcome of the
	* transaction is to roll back the transaction.
	* @throws Exception Thrown if the transaction manager
	* encounters an unexpected error condition.
	*/
	public void setRollbackOnly() throws Exception;
	/**
	* Modify the value of the timeout value that is
	* associated with the transactions started by the
	* current thread with the begin method.
	* @param arg0 seconds - The value of the timeout
	* in seconds. If the value is zero, the transaction
	* service restores the default value.
	* @throws Exception Thrown if the transaction manager
	* encounters an unexpected error condition.
	*/
	public void setTransactionTimeout(int arg0) throws Exception;

}
