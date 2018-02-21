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


import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.sius.salesforce.psi.filetype.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.sius.salesforce.psi.filetype.ApexTypes.*;

public class ApexAdditionAssignExpressionImpl extends ApexExpressionImpl implements ApexAdditionAssignExpression {

  public ApexAdditionAssignExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) ((ApexVisitor)visitor).visitAdditionAssignExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ApexExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ApexExpression.class);
  }

}
