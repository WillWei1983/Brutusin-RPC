/*
 * Copyright 2015 Ignacio del Valle Alles idelvall@brutusin.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.brutusin.rpc.actions.http;

import java.util.Map;
import org.brutusin.json.spi.JsonSchema;
import org.brutusin.rpc.Description;
import org.brutusin.rpc.http.Cacheable;
import org.brutusin.rpc.actions.DynamicSchemaProviderActionHelper;
import org.brutusin.rpc.http.HttpActionSupport;
import org.brutusin.rpc.http.SafeAction;

/**
 *
 * @author Ignacio del Valle Alles idelvall@brutusin.org
 */
@Description("This descriptor service returns the [**dynamic schema**](https://github.com/brutusin/Brutusin-RPC/blob/master/README.md#dynamic-schemas) of other `HTTP` services.")
public class DynamicSchemaProviderAction extends SafeAction<DynamicSchemaProviderInput, Map<String, JsonSchema>> {

    @Override
    public Cacheable<Map<String, JsonSchema>> execute(DynamicSchemaProviderInput input) throws Exception {
        return Cacheable.conditionally(DynamicSchemaProviderActionHelper.execute(input, HttpActionSupport.getInstance().getHttpServices()));
    }
}
