/*-
 * #%L
 * Bobcat Parent
 * %%
 * Copyright (C) 2016 Cognifide Ltd.
 * %%
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
 * #L%
 */
package com.cognifide.bdd.demo.po.customersurvey;

import com.cognifide.qa.bb.aem.ui.AemDialog;
import com.cognifide.qa.bb.aem.ui.component.AemComponent;
import com.cognifide.qa.bb.qualifier.PageObject;
import com.google.inject.Inject;

@PageObject
@AemComponent(cssClassName = "accountname", group = "Form", name = "Account Name")
public class AccountNameComponent {

  @Inject
  private AemDialog aemDialog;

  public AemDialog getAemDialog() {
    return aemDialog;
  }
}
