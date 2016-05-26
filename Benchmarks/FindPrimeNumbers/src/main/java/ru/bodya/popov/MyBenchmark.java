/*
 * Copyright (c) 2014, Oracle America, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of Oracle nor the names of its contributors may be used
 *    to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package ru.bodya.popov;

import org.openjdk.jmh.annotations.Benchmark;
import java.util.Random;

public class MyBenchmark {

    @Benchmark
    public  void fermatPlusSqrt() {

        for (int i = 2; i < 2130; i++) {
            if (fastPrime(i, 1)  == 1)
                Prime(i);

        }

    }

    @Benchmark
    public  void onlySqrt() {

        for (int i = 2; i < 2130; i++) {
            Prime(i);
        }

    }


    private int fastPrime(int n, int times) {
        if (times == 0)
            return 1;
        if (fermatTest(n) == 0)
            return 0;
        else return fastPrime(n, times - 1);
    }

    private int fermatTest(int n) {

        Random random = new Random();
        int r = random.nextInt() % (n - 1) + 1;

        int result = expMod(r, n, n);

        if (result == r)
            return 1;
        else
            return 0;

    }

    private int expMod(int base, int n, int m) {
        if (n == 0)
            return 1;
        if (n % 2 == 0) {
            int res = expMod(base, n / 2, m);
            res *= res;
            return res % m;
        } else {
            int res = base * expMod(base, n - 1, m);
            return res % m;
        }
    }

    private int Prime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }

}

