package org.example.problem2207;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maximumSubsequenceCount1() {
        String text = "abdcdbc";
        String pattern = "ac";
        int expected = 4;
        assertEquals(expected, new Solution().maximumSubsequenceCount(text, pattern));
    }


    @Test
    void maximumSubsequenceCount2() {
        String text = "aabb";
        String pattern = "ab";
        int expected = 6;
        assertEquals(expected, new Solution().maximumSubsequenceCount(text, pattern));
    }
    @Test
    void maximumSubsequenceCount3() {
        String text = "vnedkpkkyxelxqptfwuzc" +
                "jhqmwagvrglkeivowvbjdoyydnjrq" +
                "rqejoyptzoklaxcjxbrrfmpdxckfjz" +
                "ahparhpanwqfjrpbslsyiwbldnpjqi" +
                "shlsuagevjmiyktgofvnyncizswldwn" +
                "ngnkifmaxbmospdeslxirofgqouaapf" +
                "gltgqxdhurxljcepdpndqqgfwkfiqrw" +
                "uwxfamciyweehktaegynfumwnhrgrhc" +
                "luenpnoieqdivznrjljcotysnlylysw" +
                "vdlkgsvrotavnkifwmnvgagjykxgwai" +
                "mavqsxuitknmbxppgzfwtjdvegapcpl" +
                "reokicxcsbdrsyfpustpxxssnouifky" +
                "pwqrywprjlyddrggkcglbgcrbihgpxx" +
                "osmejchmzkydhquevpschkpyulqxgdu" +
                "qkqgwnsowxrmgqbmltrltzqmmpjilpf" +
                "xocflpkwithsjlljxdygfvstvwqsyxl" +
                "kknmgpppupgjvfgmxnwmvrfuwcrsado" +
                "myddazlonjyjdeswwznkaeaasyvurpg" +
                "yvjsiltiykwquesfjmuswjlrphsdthm" +
                "uqkrhynmqnfqdlwnwesdmiiqvcpingb" +
                "cgcsvqmsmskesrajqwmgtdoktreqssu" +
                "tpudfykriqhblntfabspbeddpdkowne" +
                "hqszbmddizdgtqmobirwbopmoqzwydn" +
                "pqnvkwadajbecmajilzkfwjnpfyamud" +
                "pppuxhlcngkign";
        String pattern = "rr";
        int expected = 496;
        assertEquals(expected, new Solution().maximumSubsequenceCount(text, pattern));
    }
}