package com.xingray.container.helper;

import com.xingray.container.operators.primary.mapper.*;

import java.lang.reflect.Array;

import static com.xingray.container.helper.ContainerCore.isEmpty;

public class Converter {
    public static boolean[] convert(T[] array, GenericBooleanMapper<Boolean> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static byte[] convert(T[] array, GenericByteMapper<Byte> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static char[] convert(T[] array, GenericCharMapper<Character> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static short[] convert(T[] array, GenericShortMapper<Short> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] convert(T[] array, GenericIntMapper<Integer> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static long[] convert(T[] array, GenericLongMapper<Long> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static float[] convert(T[] array, GenericFloatMapper<Float> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static double[] convert(T[] array, GenericDoubleMapper<Double> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static Boolean[] convert(boolean[] array, BooleanGenericMapper<Boolean> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        Boolean[] result = new Boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static boolean[] convert(boolean[] array, BooleanBooleanMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static byte[] convert(boolean[] array, BooleanByteMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static char[] convert(boolean[] array, BooleanCharMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static short[] convert(boolean[] array, BooleanShortMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] convert(boolean[] array, BooleanIntMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static long[] convert(boolean[] array, BooleanLongMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static float[] convert(boolean[] array, BooleanFloatMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static double[] convert(boolean[] array, BooleanDoubleMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static Byte[] convert(byte[] array, ByteGenericMapper<Byte> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        Byte[] result = new Byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static boolean[] convert(byte[] array, ByteBooleanMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static byte[] convert(byte[] array, ByteByteMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static char[] convert(byte[] array, ByteCharMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static short[] convert(byte[] array, ByteShortMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] convert(byte[] array, ByteIntMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static long[] convert(byte[] array, ByteLongMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static float[] convert(byte[] array, ByteFloatMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static double[] convert(byte[] array, ByteDoubleMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static Character[] convert(char[] array, CharGenericMapper<Character> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        Character[] result = new Character[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static boolean[] convert(char[] array, CharBooleanMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static byte[] convert(char[] array, CharByteMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static char[] convert(char[] array, CharCharMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static short[] convert(char[] array, CharShortMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] convert(char[] array, CharIntMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static long[] convert(char[] array, CharLongMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static float[] convert(char[] array, CharFloatMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static double[] convert(char[] array, CharDoubleMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static Short[] convert(short[] array, ShortGenericMapper<Short> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        Short[] result = new Short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static boolean[] convert(short[] array, ShortBooleanMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static byte[] convert(short[] array, ShortByteMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static char[] convert(short[] array, ShortCharMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static short[] convert(short[] array, ShortShortMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] convert(short[] array, ShortIntMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static long[] convert(short[] array, ShortLongMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static float[] convert(short[] array, ShortFloatMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static double[] convert(short[] array, ShortDoubleMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static Integer[] convert(int[] array, IntGenericMapper<Integer> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        Integer[] result = new Integer[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static boolean[] convert(int[] array, IntBooleanMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static byte[] convert(int[] array, IntByteMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static char[] convert(int[] array, IntCharMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static short[] convert(int[] array, IntShortMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] convert(int[] array, IntIntMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static long[] convert(int[] array, IntLongMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static float[] convert(int[] array, IntFloatMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static double[] convert(int[] array, IntDoubleMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static Long[] convert(long[] array, LongGenericMapper<Long> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        Long[] result = new Long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static boolean[] convert(long[] array, LongBooleanMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static byte[] convert(long[] array, LongByteMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static char[] convert(long[] array, LongCharMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static short[] convert(long[] array, LongShortMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] convert(long[] array, LongIntMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static long[] convert(long[] array, LongLongMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static float[] convert(long[] array, LongFloatMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static double[] convert(long[] array, LongDoubleMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static Float[] convert(float[] array, FloatGenericMapper<Float> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        Float[] result = new Float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static boolean[] convert(float[] array, FloatBooleanMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static byte[] convert(float[] array, FloatByteMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static char[] convert(float[] array, FloatCharMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static short[] convert(float[] array, FloatShortMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] convert(float[] array, FloatIntMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static long[] convert(float[] array, FloatLongMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static float[] convert(float[] array, FloatFloatMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static double[] convert(float[] array, FloatDoubleMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static Double[] convert(double[] array, DoubleGenericMapper<Double> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        Double[] result = new Double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static boolean[] convert(double[] array, DoubleBooleanMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static byte[] convert(double[] array, DoubleByteMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static char[] convert(double[] array, DoubleCharMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static short[] convert(double[] array, DoubleShortMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        short[] result = new short[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static int[] convert(double[] array, DoubleIntMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static long[] convert(double[] array, DoubleLongMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        long[] result = new long[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static float[] convert(double[] array, DoubleFloatMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        float[] result = new float[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static double[] convert(double[] array, DoubleDoubleMapper mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }

    public static <T> T[] convertGeneric(int[] array, T[] toArray, IntGenericMapper<T> mapper) {
        if (isEmpty(array)) {
            return null;
        }
        if (toArray == null) {
            return null;
        }

        int length = array.length;
        if (toArray.length < length) {
            // noinspection unchecked
            toArray = (T[]) Array.newInstance(toArray.getClass().getComponentType(), length);
        }
        for (int i = 0; i < length; i++) {
            toArray[i] = mapper.map(array[i]);
        }
        return toArray;
    }

    public static <T> int[] convertGeneric(T[] array, GenericIntMapper<T> mapper) {
        if (isEmpty(array)) {
            return null;
        }

        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = mapper.map(array[i]);
        }
        return result;
    }
}
