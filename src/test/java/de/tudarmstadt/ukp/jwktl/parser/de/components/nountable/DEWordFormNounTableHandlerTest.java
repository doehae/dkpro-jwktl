/*******************************************************************************
 * Copyright 2013
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.tudarmstadt.ukp.jwktl.parser.de.components.nountable;

import de.tudarmstadt.ukp.jwktl.parser.de.components.DEGenderText;
import junit.framework.TestCase;

public class DEWordFormNounTableHandlerTest extends TestCase {

	private DEWordFormNounTableHandler nounTableHandler;

	@Override
	protected void setUp() throws Exception {
		nounTableHandler = new DEWordFormNounTableHandler();
	}

	public void testGetsSetGenus() {
		nounTableHandler.setGenusByIndex(DEGenderText.F, 2);
		assertEquals(DEGenderText.F, nounTableHandler.getGenusByIndex(2));
	}

	public void testGetsNotSetGenus() {
		assertNull(nounTableHandler.getGenusByIndex(3));
	}

	public void testThrowsExceptionSettingGenusWithInvalidIndex() {
		try {
			nounTableHandler.setGenusByIndex(DEGenderText.F, 0);
			fail();
		} catch (IllegalArgumentException expected) {
			assertTrue(true);
		}
		try {
			nounTableHandler.setGenusByIndex(DEGenderText.F, 5);
			fail();
		} catch (IllegalArgumentException expected) {
			assertTrue(true);
		}
	}

	public void testThrowsExceptionGettingGenusWithInvalidIndex() {
		try {
			nounTableHandler.getGenusByIndex(0);
			fail();
		} catch (IllegalArgumentException expected) {
			assertTrue(true);
		}
		try {
			nounTableHandler.getGenusByIndex(5);
			fail();
		} catch (IllegalArgumentException expected) {
			assertTrue(true);
		}
	}

}
