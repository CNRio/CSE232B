/* XPath.g4
 *
 *
 */

grammar XPath;

ap
	: doc '/' rp                   # ApChildren
	| doc '//' rp                  # ApAll
	;

doc
	: DOC '(' '"' fname '"' ')'
	;

fname
	: NAME ('.' NAME)?
	;

rp
	: NAME                         # TagName
	| '*'                          # AllChildren
	| '.'                          # Current
	| '..'                         # Parent
	| TXT                          # Text
	| '@' NAME                     # Attribute
	| '(' rp ')'                   # RpwithP
	| rp '/' rp                    # RpChildren
	| rp '//' rp                   # RpAll
	| rp '[' filter ']'            # RpFilter
	| rp ',' rp                    # TwoRp
	;

filter
	: rp                           # FilRp
	| rp '=' rp                    # FilEqual
	| rp 'eq' rp                   # FilEqual
	| rp '==' rp                   # FilIs
	| rp 'is' rp                   # FilIs
	| '(' filter ')'               # FilwithP
	| filter 'and' filter          # FilAnd
	| filter 'or' filter           # FilOr
	| 'not' filter                 # FilNot
	;

DOC: 'document';
NAME: [a-zA-Z0-9_-]+;
TXT: 'text()';
WS : [ \t\r\n]+ -> skip;

