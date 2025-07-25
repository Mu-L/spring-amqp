/*
 * Copyright 2016-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.amqp.core;

import java.util.LinkedHashMap;
import java.util.Map;

import org.jspecify.annotations.Nullable;

/**
 * Base class for builders supporting arguments.
 *
 * @author Gary Russell
 * @author Ngoc Nhan
 * @author Artem Bilan
 *
 * @since 1.6
 *
 */
public abstract class AbstractBuilder {

	private @Nullable Map<String, @Nullable Object> arguments;

	/**
	 * Return the arguments map, after creating one if necessary.
	 * @return the arguments.
	 */
	protected Map<String, @Nullable Object> getOrCreateArguments() {
		if (this.arguments == null) {
			this.arguments = new LinkedHashMap<>();
		}
		return this.arguments;
	}

	protected @Nullable Map<String, @Nullable Object> getArguments() {
		return this.arguments;
	}

}
