grammar syntax;

// For demonstration only, the actual syntax rules implementation for a language will be far more complex

// Parser rules
words: (HELLO | WORLD | ANTLR)* EOF;

// Lexer rules
HELLO: 'hello';
WORLD: 'world';
ANTLR: 'antlr';
WS: [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines