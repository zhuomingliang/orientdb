/* Generated By:JJTree: Do not edit this line. OLetStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import java.util.Map;

public class OLetStatement extends OStatement {
  protected OIdentifier name;

  protected OStatement  statement;
  protected OExpression expression;

  public OLetStatement(int id) {
    super(id);
  }

  public OLetStatement(OrientSql p, int id) {
    super(p, id);
  }

  @Override public void toString(Map<Object, Object> params, StringBuilder builder) {
    builder.append("LET ");
    name.toString(params, builder);
    builder.append(" = ");
    if (statement != null) {
      statement.toString(params, builder);
    } else {
      expression.toString(params, builder);
    }
  }
}
/* JavaCC - OriginalChecksum=cc646e5449351ad9ced844f61b687928 (do not edit this line) */
