/*
 *  Copyright 2014 Mark Borner
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
*/
package com.sius.salesforce.psi.filetype.impl;

import com.sius.salesforce.psi.filetype.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.sius.salesforce.psi.filetype.ApexTypes.*;
import static au.com.borner.salesforce.plugin.apex.psi.ApexTypes.IDENTIFIER;

public class ApexInnerCreatorImpl extends ASTWrapperPsiElement implements ApexInnerCreator {

  public ApexInnerCreatorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) ((ApexVisitor)visitor).visitInnerCreator(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ApexClassCreatorRest getClassCreatorRest() {
    return findNotNullChildByClass(ApexClassCreatorRest.class);
  }

  @Override
  @Nullable
  public ApexNonWildcardTypeArgumentsOrDiamond getNonWildcardTypeArgumentsOrDiamond() {
    return findChildByClass(ApexNonWildcardTypeArgumentsOrDiamond.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
