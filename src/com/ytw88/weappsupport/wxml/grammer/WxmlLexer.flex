package com.ytw88.weappsupport.wxml.grammer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.ytw88.weappsupport.wxml.psi.WxmlTypes.*;

%%

%{
  public WxmlLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class WxmlLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

S=[ \t\n\x0B\f\r]+
COMMENT=\<!--[\s\S]*?--\>
NCNAME=[a-zA-Z_0-9]?
CHARDATA=[a-zA-Z_0-9]?

%%
<YYINITIAL> {
  {WHITE_SPACE}           { return WHITE_SPACE; }

  "="                     { return EQ; }
  "AttCharData"           { return ATTCHARDATA; }
  "DefaultAttCharData"    { return DEFAULTATTCHARDATA; }

  {S}                     { return S; }
  {COMMENT}               { return COMMENT; }
  {NCNAME}                { return NCNAME; }
  {CHARDATA}              { return CHARDATA; }

}

[^] { return BAD_CHARACTER; }
