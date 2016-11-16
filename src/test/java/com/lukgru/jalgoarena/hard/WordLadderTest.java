package com.lukgru.jalgoarena.hard;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

/**
 * Created by grubal on 2016-11-16.
 */
public class WordLadderTest {

    private WordLadder wordLadder = new WordLadder();

    @Test
    public void test1() {
        //given
        String begin = "qa";
        String end = "sq";
        String[] words = {"hi","ln","lo","pt","di","lr","ho","ya","lt","yb","ye","qa","hz","uh","ma","mb","yo","me","mi",
                "ur","if","mn","mo","mr","io","mt","am","an","er","ra","rb","ar","as","re","na","ex","au","nb","av","rh",
                "ne","fa","ni","rn","ba","fe","no","be","bi","fm","fr","sb","br","sc","se","sh","si","wm","sm","ga","sn",
                "so","ca","ge","sq","sr","st","or","os","ci","kr","go","ow","cm","co","ta","tb","cr","tc","pa","pb","th",
                "ti","la","ph","tm","le","ha","pi","to","pm","li","he","db","po"};
        HashSet dictionary = new HashSet();
        for (String word : words) {
            dictionary.add(word);
        }

        //when
        int length = wordLadder.ladderLength(begin, end, dictionary);

        //then
        int expected = -1;
        assertEquals(expected, length);
    }

    @Test
    public void test2() {
        //given
        String begin = null;
        String end = null;
        HashSet dictionary = null;

        //when
        int length = wordLadder.ladderLength(begin, end, dictionary);

        //then
        int expected = -1;
        assertEquals(expected, length);
    }

    @Test
    public void test3() {
        //given
        String begin = "teach";
        String end = "place";
        String[] words = {"rheum","wilts","fetch","peace","teach","peach","poach","berra","place","purer","pooch","peale"};
        HashSet dictionary = new HashSet();
        for (String word : words) {
            dictionary.add(word);
        }

        //when
        int length = wordLadder.ladderLength(begin, end, dictionary);

        //then
        int expected = -1;
        assertEquals(expected, length);
    }

    @Test
    public void test4() {
        //given
        String begin = "hot";
        String end = "dog";
        String[] words = {"hog","pot","tot","hop","dot","cog","hot","dog"};
        HashSet dictionary = new HashSet();
        for (String word : words) {
            dictionary.add(word);
        }

        //when
        int length = wordLadder.ladderLength(begin, end, dictionary);

        //then
        int expected = -1;
        assertEquals(expected, length);
    }

    @Test
    public void test5() {
        //given
        String begin = "a";
        String end = "c";
        String[] words = {"a","b","c"};
        HashSet dictionary = new HashSet();
        for (String word : words) {
            dictionary.add(word);
        }

        //when
        int length = wordLadder.ladderLength(begin, end, dictionary);

        //then
        int expected = -1;
        assertEquals(expected, length);
    }

    @Test
    public void test6() {
        //given
        String begin = "ta";
        String end = "if";
        String[] words = {"cf","io","jr","is","ta","sc","ph","ha","to","if","ca","hf","ts"};
        HashSet dictionary = new HashSet();
        for (String word : words) {
            dictionary.add(word);
        }

        //when
        int length = wordLadder.ladderLength(begin, end, dictionary);

        //then
        int expected = -1;
        assertEquals(expected, length);
    }

    @Test
    public void test7() {
        //given
        String begin = "game";
        String end = "thee";
        String[] words = {"heat","thee","game","frye","tree","faye","free","fame","hell"};
        HashSet dictionary = new HashSet();
        for (String word : words) {
            dictionary.add(word);
        }

        //when
        int length = wordLadder.ladderLength(begin, end, dictionary);

        //then
        int expected = -1;
        assertEquals(expected, length);
    }

    @Test
    public void test8() {
        //given
        String begin = "kiss";
        String end = "tusk";
        String[] words = {"disk","sang","musk","ties","dusk","diss","muss","kiss","miss","tusk"};
        HashSet dictionary = new HashSet();
        for (String word : words) {
            dictionary.add(word);
        }

        //when
        int length = wordLadder.ladderLength(begin, end, dictionary);

        //then
        int expected = -1;
        assertEquals(expected, length);
    }

    @Test
    public void test9() {
        //given
        String begin = "cet";
        String end = "ism";
        String[] words = {"fie","dec","baa","bad","dee","fig","bah","ion","bag","fin","del","den","ego","dem","fir","ban",
                "via","luz","fit","vic","bar","ted","vie","bat","fix","tee","dew","yon","vim","bay","ten","you","ran",
                "ram","rap","tex","ray","hob","hod","hoe","hog","hon","hop","hot","sec","see","cet","fla","ire","sen",
                "irk","set","sew","abe","flo","flu","lye","tho","gob","god","gog","did","bed","die","ism","ace","dig",
                "bee","thy","goo","din","jut","dim","lyx","gos","dip","woe","tia","got","dis","bet","red","tie","dix",
                "pad","ref","act","woo","won","tin","pal","pan","rep","pam","wot","tit","pap","elf","ada","par","sgt",
                "rev","pat","pas","rex","ell","chi","ito","paw","elm","pay","its","ado","ads","she","adz","fob","foe",
                "fog","cid","shy","fop","for","sic","fox","sid","yum","oaf","iva","yup","oak","ump","sin","end","sip",
                "sis","vow","oar","six","ivy","aft","hub","hue","bib","hug","bid","hui","age","wry","hun","hum","big",
                "bin","hut","hus","ago","rib","rid","bit","pea","ski","rig","pei","nag","rim","rip","rio","gte","nan",
                "nam","aha","per","nap","pet","sky","nat","oct","pew","fry","odd","ode","doc","doe","dog","aid","gum",
                "sly","gun","don","aim","ail","gut","tod","dot","guy","toe","air","tog","dow","mac","mad","ton","tom",
                "top","mai","too","era","maj","tot","ere","mao","erg","man","map","tow","mas","toy","maw","may","err",
                "max","off","cob","cod","cog","oft","fun","com","col","fur","coo","con","use","sob","cot","lab","ned",
                "coy","pie","bmw","cox","lad","pig","sol","mci","son","lag","pin","sop","pip","alb","ala","lap","sow",
                "pit","lao","ale","soy","net","sox","nev","ali","all","new","lax","lay","bob","boa","oho","try","gym",
                "ohs","bog","spy","gyp","boo","rob","amp","rod","box","bow","amy","wyo","boy","meg","ron","eva","oil",
                "ana","mel","eve","and","mes","row","ani","roy","met","mew","ann","kay","ant","cry","any","ewe","due",
                "duh","dug","ply","dun","duo","tub","tug","led","jab","tun","qom","leg","nil","jag","lei","tut","mgm",
                "len","jan","tux","jam","ape","jar","let","nix","jaw","apr","brr","jay","ola","old","eye","cub","stu",
                "sty","cup","sub","sue","mia","pod","sui","poe","mid","sum","mig","poi","keg","pol","sun","two","sup",
                "pop","ara","mil","min","arc","pot","ken","are","ian","mir","pox","ark","arm","mix","btu","rte","art",
                "yak","yam","yap","yaw","bud","ono","dye","ibm","bug","ash","ibo","ask","bun","bum","rub","bur","asp",
                "but","ass","bus","rue","lid","buy","jed","lie","rum","hah","hag","rut","lin","hal","ate","han","ham",
                "lit","zed","has","liz","haw","hay","ats","zen","pro","opt","aug","pry","auk","nod","noh","kid","gad",
                "non","gag","ava","nor","ave","kin","not","gal","kip","yea","nov","now","gap","kit","wac","gas","wad",
                "wag","gay","orb","ora","ore","wan","yep","was","war","yet","yew","awe","way","bye","wax","ifs","awl",
                "pub","rye","mob","jib","moe","mod","pug","fad","pun","jig","pup","mom","mon","put","jim","pus","axe",
                "hen","hem","fan","hep","her","mow","far","fat","hex","hew","fax","hey","fay","val","zip","van","zit",
                "vat","aye","lob","log","gee","lon","lop","our","gem","out","gel","lot","geo","ger","web","low","wed",
                "ear","get","eat","wei","ova","yip","wen","wet","nub","owe","feb","ike","hid","dab","fed","owl","hie",
                "nun","own","fee","nut","him","hip","fen","pyx","eco","dan","hit","his","tab","tad","few","fez","tag",
                "fey","day","ila","tan","tam","tap","tao","tar","vet","tat","ill","ilk","tax","job","mug","who","joe",
                "jog","gig","mum","cab","cad","why","gil","gin","eel","imp","jot","cal","can","zoe","cap","wig","sac",
                "joy","cat","sad","sag","caw","zoo","ltd","ina","win","ind","sam","sal","wis","san","sap","wit","inn",
                "saw","sax","ins","fib","lug"};
        HashSet dictionary = new HashSet();
        for (String word : words) {
            dictionary.add(word);
        }

        //when
        int length = wordLadder.ladderLength(begin, end, dictionary);

        //then
        int expected = -1;
        assertEquals(expected, length);
    }

}
