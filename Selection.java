/*
Program Name: Selection
Author: Noah Webb
Class: AP Computer Science
Date: 03/05/17
Program description: Selection arranges an array from least to greatest using
the selection method.
What I learned from this program: How to use the selection method to arrange
arrays.
Difficulties: Originally had a typo in a variable name, threw off other uses 
of that variable. Corrected to fix.
*/


import java.util.*;
import java.io.*;
public class Selection
{
    public static void main (String args[])
    {
        Scanner scan = null;
        try 
        {
            scan = new Scanner(new File("numsort.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
        
        int sort[] = new int[1000];
        int x=0;
        
        while(scan.hasNext())
        {
           sort[x]=scan.nextInt();
           x++;
        }
        fix(sort);
        int count = 0;
        for(x=0;x<1000;x++)
        {
            if(sort[x]!=0)
            {
                count++;
                if (count%12==0)
                {
                    System.out.print(sort[x]+"\n");
                }
                else
                {
                    System.out.print(sort[x]+"\t");
                } 
            }
        }
    }
        
        
        public static void fix (int a[])
        {
            int min,minIndex;
            for (int i=0; i<a.length;i++)
            {
                min = a[i];
                minIndex=i;
                for (int j=i+1;j<a.length;j++)
                {
                    if (a[j]<min)
                    {
                        min = a[j];
                        minIndex=j;
                    }
                }
                a[minIndex]=a[i];
                a[i]=min;
            }
            
        }
    }  

/*

1	2	2	2	3	3	5	5	6	6	11	13
13	13	13	16	17	17	19	25	27	27	33	34
37	37	43	45	49	51	51	52	54	55	57	57
58	60	63	64	66	75	79	79	81	85	87	90
92	92	94	95	95	97	97	99	107	109	109	111
113	113	115	116	118	121	121	125	129	132	133	133
133	134	144	144	145	148	149	151	155	155	156	156
156	159	159	162	164	165	165	167	167	168	171	173
178	179	181	183	186	186	190	191	200	203	203	203
204	205	206	207	207	207	208	209	209	210	210	215
216	217	220	220	222	223	225	228	229	230	231	233
234	235	235	238	239	239	242	245	251	252	253	258
263	268	269	271	274	276	278	278	289	296	299	301
303	304	305	306	308	308	310	311	316	319	321	321
322	323	326	329	330	333	335	338	339	340	340	345
349	350	353	353	354	355	355	356	357	358	359	362
366	366	368	374	374	376	379	379	382	386	388	392
393	394	396	396	398	399	399	399	399	401	401	401
405	407	408	413	414	415	416	416	417	418	418	420
424	426	430	432	436	436	438	440	442	442	446	446
448	449	451	456	456	457	458	460	461	462	463	470
476	477	480	480	482	484	485	487	490	490	495	501
502	504	511	511	511	511	513	513	513	514	515	518
519	523	526	527	529	531	534	534	536	537	538	538
539	540	544	545	550	554	555	558	559	559	560	561
564	567	568	568	569	571	572	574	575	578	580	580
580	581	581	582	583	583	583	584	585	585	585	587
588	590	591	596	599	604	606	614	615	616	616	617
618	620	625	628	631	631	634	635	635	639	642	647
654	654	655	659	659	659	664	666	666	669	669	672
676	678	678	684	684	685	687	687	689	690	692	692
695	698	699	704	707	707	707	717	717	717	717	717
719	719	729	730	734	734	736	736	738	740	740	749
751	752	753	754	754	754	755	759	761	763	763	768
772	778	780	783	785	786	790	792	793	795	796	798
799	799	800	802	813	813	817	820	820	821	822	826
826	827	827	829	830	830	831	832	833	835	836	837
841	846	853	854	857	857	858	858	861	866	868	868
869	872	877	879	880	881	882	888	898	909	910	914
919	919	920	920	921	927	930	931	934	934	938	943
944	945	950	953	955	957	960	962	966	968	970	971
974	975	981	989	995	998	999	999	
     


  
 
*/
