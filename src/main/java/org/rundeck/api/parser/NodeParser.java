/*
 * Copyright 2011 Vincent Behar
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
package org.rundeck.api.parser;

import org.dom4j.Node;

/**
 * Interface to be implemented for parsers that handle XML {@link Node}s
 * 
 * @author Vincent Behar
 */
public interface NodeParser<T> {

    /**
     * Parse the given XML {@link Node}
     * 
     * @param node
     * @return any object holding the converted value
     */
    T parseNode(Node node);

}
