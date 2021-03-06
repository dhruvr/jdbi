/* Copyright 2004-2006 Brian McCallister
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.skife.jdbi;

import org.skife.jdbi.unstable.decorator.BaseHandleDecorator;
import org.skife.jdbi.unstable.decorator.HandleDecorator;

import java.util.Map;

public class MyHandleDecorator implements HandleDecorator
{
    public Handle decorate(IDBI dbi, Handle base)
    {
        return new BaseHandleDecorator(base)
        {
            public Map first(String statement) throws DBIException
            {
                final Map row = super.first(statement);
                row.put("wombat", "hello");
                return row;
            }
        };
    }
}

