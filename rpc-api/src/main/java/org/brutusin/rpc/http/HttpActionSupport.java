/*
 * Copyright 2015 brutusin.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.brutusin.rpc.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.brutusin.rpc.RpcActionSupport;

/**
 *
 * @author Ignacio del Valle Alles idelvall@brutusin.org
 */
public abstract class HttpActionSupport extends RpcActionSupport{

    public static HttpActionSupport getInstance() {
        RpcActionSupport instance = RpcActionSupport.getInstance();
        if(instance instanceof HttpActionSupport){
            return (HttpActionSupport)instance;
        }
        throw new IllegalStateException("Caller is not in a HTTP request scope");
    }
    
    public abstract HttpServletRequest getHttpServletRequest();

    public abstract HttpServletResponse getHttpServletResponse();

}
