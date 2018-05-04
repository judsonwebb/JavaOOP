/*
Program Name: Ascii
Author: Noah Webb
Class: AP Computer Science
Date: 11/22/16
Program description: Ascii prints out a list of Ascii letters and their 
corresponding numbers.
What I learned from this program: How to add with Ascii values to produce 
different characters.
Difficulties: The loop initially stopped 45 lines too late. I added y=y+45 
to the end of the loop to fix.
*/
public class Ascii
{
    public static void main (String args[])
    {
        
        
        int y=0;
        
        for (int x=32; y!=122; x++)
        {
            y=x;
            
            char letter = (char)y;
            char letterTwo = (char)(y+45);
            
            System.out.println(letter+"\t"+y+"\t"+letterTwo+"\t"+(y+45));
            
            y=y+45;
        }
    }
}
/* Sample Output:
  
 	32	M	77
!	33	N	78
"	34	O	79
#	35	P	80
$	36	Q	81
%	37	R	82
&	38	S	83
'	39	T	84
(	40	U	85
)	41	V	86
*	42	W	87
+	43	X	88
,	44	Y	89
-	45	Z	90
.	46	[	91
/	47	\	92
0	48	]	93
1	49	^	94
2	50	_	95
3	51	`	96
4	52	a	97
5	53	b	98
6	54	c	99
7	55	d	100
8	56	e	101
9	57	f	102
:	58	g	103
;	59	h	104
<	60	i	105
=	61	j	106
>	62	k	107
?	63	l	108
@	64	m	109
A	65	n	110
B	66	o	111
C	67	p	112
D	68	q	113
E	69	r	114
F	70	s	115
G	71	t	116
H	72	u	117
I	73	v	118
J	74	w	119
K	75	x	120
L	76	y	121
M	77	z	122
  
  
  
*/
