import java.io.*;
import java.util.Arrays;

/** Attention:
 * 1.UTF-8编码格式 一个汉字3个字节; 而GBK中 一个汉字2个字节. */

/**
 * @author Gejianping
 * @version 0.0.1
 * @date 2020/06/08 12:34:
 */
public class Exercise {

    public static void main(String[] args) throws IOException {

        /**
         *  test001();
         *  test002();
         *  test003();
         *  test004();
         *  test005();
         *  test006();
         *  test007();
         *  test008();
         *  test009();
         */
        test010();
    }

    /** 一次写一个字节 */
    public static void test001() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Dev\\Projects\\GitLab\\relax-framework-parent\\exercise\\src\\cache\\test001.txt");
        fileOutputStream.write(97);
        fileOutputStream.write(49);
        fileOutputStream.write(48);
        fileOutputStream.write(48);
        fileOutputStream.close();
    }


    /** 一次写多个字节
     *  如果写的第一个字节是正数(0-127),那么显示的时候会查询ASCII表
     *  如果写的第一个字节是负数,那第一个字节会和第二个字节,俩个字节组成一个中文显示,查询系统默认码表(GBK)
     * */
    public static void test002() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Dev\\Projects\\GitLab\\relax-framework-parent\\exercise\\src\\cache\\test002.txt");

        /** ASCII */
        byte[] bytes = {65,66,67,68,69,10};
        /** GBK */
        byte[] bytes01 = {-65,-66,-67,68,69,10};
        fileOutputStream.write(bytes);
        fileOutputStream.write(bytes01);
        /**
         * @param      b     the data.
         * @param      off   the start offset in the data.
         * @param      len   the number of bytes to write.
         * @exception  IOException  if an I/O error occurs.
         */
        fileOutputStream.write(bytes,1,1);

        fileOutputStream.close();
    }

    /** FileOutputStream 写入字符串String的方法 */
    public static void test003() throws IOException {

        /** UTF-8编码格式 一个汉字3个字节; 而GBK中 一个汉字2个字节 */
        /** [-24, -128, -127, -26, -99, -65, 44] */
        byte[] bytes = "老板,".getBytes();
        System.out.println(Arrays.toString(bytes));

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Dev\\Projects\\GitLab\\relax-framework-parent\\exercise\\src\\cache\\test003.txt");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    /** 追加写(续写) */
    public static void test004() throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Dev\\Projects\\GitLab\\relax-framework-parent\\exercise\\src\\cache\\test004.txt",true);
        for (int i=0;i<10;i++) {
            fileOutputStream.write("Hello_World!!!\n".getBytes());
        }
        fileOutputStream.close();
    }

    /** FileInputStream(String name): String name: 文件的路径
     *  FileInputStream(File file): File file: 文件对象
     *  构造方法作用: 1.创建一个FileInputStream对象;2.会把FileInputStream对象指向到构造方法中要读取的文件
     *  读取数据的原理(硬盘-->内存)
     *      Java程序 --> JVM --> OS --> OS读取数据的方法 --> 读取文件
     *  字节输入流的使用步骤(重点):
     *      1.创建FileInputStream对象,构造方法中绑定要读取的数据源
     *      2.使用FileInputStream对象中的方法read,读取文件
     *      3.释放资源
     * */
    public static void test005() throws IOException{
        FileInputStream fileInputStream = new FileInputStream("D:\\Dev\\Projects\\GitLab\\relax-framework-parent\\exercise\\src\\cache\\test004.txt");
        /** int read() 读取文件中的一个字节并返回,读取到文件的末尾返回-1 */
        /** fileInputStream.read() 记录 读取到的字节 ASCII码 */
        Integer byteCache = 0;
        while ((byteCache = fileInputStream.read())!=-1){
            System.out.println(byteCache);
        }
        fileInputStream.close();
    }

    /** 字节流一次读取多个字节的方法
     * fileInputStream.read(bytes) 返回 读取的字节流的长度 */
    public static void test006() throws IOException{
        FileInputStream fileInputStream = new FileInputStream("D:\\Dev\\Projects\\GitLab\\relax-framework-parent\\exercise\\src\\cache\\test004.txt");
//        byte[] bytes = new byte[14];
//        Integer len = fileInputStream.read(bytes);
//        System.out.println(len);
//        System.out.println(Arrays.toString(bytes));
//        System.out.println(new String(bytes));

        /** 循环读取多个字节 */
        /** 存储单次读取到的多个字节 */
        byte[] KB1 = new byte[15];
        /** 记录每次读取到的有效字节个数 */
        Integer lenKB1 = 0;
        while ((lenKB1 = fileInputStream.read(KB1))!=-1){
            System.out.println(new String(KB1));
            /** String(byte bytes[], int offset, int length)
             *  把字节数组的一部分转换为字符串
             *  offset: 数组开始的索引
             *  length:转换的字节的个数
             * */
            System.out.println(new String(KB1,6,lenKB1-6));

        }
//        byte[] bytes = {72, 101, 108, 108, 111, 95, 87, 111, 114, 108, 100, 33, 33, 33};
//        String str = new String(bytes);
//        System.out.println(str);
    }

    /** 文件复制 */
    public static void test007() throws IOException {
        FileInputStream fileInputStream10 = new FileInputStream("D:\\Dev\\Projects\\GitLab\\relax-framework-parent\\exercise\\src\\cache\\source001.jpg");
        FileInputStream fileInputStream11 = new FileInputStream("D:\\Dev\\Projects\\GitLab\\relax-framework-parent\\exercise\\src\\cache\\source001.jpg");
        FileOutputStream fileOutputStream10 = new FileOutputStream("D:\\Dev\\Projects\\GitLab\\relax-framework-parent\\exercise\\src\\cache\\target0010.jpg");
        FileOutputStream fileOutputStream11 = new FileOutputStream("D:\\Dev\\Projects\\GitLab\\relax-framework-parent\\exercise\\src\\cache\\target0011.jpg");

        long start = System.currentTimeMillis();
        /** 一次 读取 或 写入 单个字节 的方式进行 文件的复制
         **/
        Integer byteCache = 0;
        while ((byteCache = fileInputStream10.read())!=-1){
            fileOutputStream10.write(byteCache);
        }

        long middle = System.currentTimeMillis();

        /** 通过一次 读取 或 写入 多个字节 的方式进行文件的 复制 */
        byte[] bytes = new byte[1024];
        Integer len = 0;
        while ((len = fileInputStream11.read(bytes))!=-1){
            fileOutputStream11.write(bytes);
        }

        /** 先关闭 写入流 再关闭 输出流 */
        fileInputStream10.close();
        fileInputStream11.close();
        fileOutputStream10.close();
        fileOutputStream11.close();

        long end = System.currentTimeMillis();

        System.out.println("每次单字节复制消耗时间:"+(middle-start));
        System.out.println("每次多字节复制消耗时间:"+(end-middle));
    }

    /** 使用字节流读取中文文件时 会出现中文乱码,此时应使用字符输入流来读取中文文件
     * GBK      1个汉字2个字节
     * UTF-8    1个汉字3个字节
     * */
    public static void test008() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\Dev\\Projects\\GitLab\\relax-framework-parent\\exercise\\src\\cache\\test008.txt");
        int byteCache = 0;
        while ((byteCache = fileInputStream.read())!=-1){
            System.out.println((char)byteCache);
        }
        fileInputStream.close();
    }

    /** 使用 字符输入流 来对 中文文件 进行读取
     *  java.io.Reader: 字符输入流,是字符输入流最顶层的父类,定义了一些共性的成员方法,是一个抽象类
     *  共性的成员方法:
     *      int read() 读取单个字符并返回
     *      int read(char[] byteCache) 一次读取多个字符,将字符读入到数组.
     *      void close() 关闭该流并释放与之关联的所有资源.
     *
     *  java.io.FileReader extends InputStreamReader extends Reader
     *      FileReader: 文件字符输入流; 作用: 将硬盘文件中的数据以字符的方式读取到内存中;
     *      构造方法: FileReader(String fileName),FileReader(File file)
     *      参数:用于指定读取的文件的数据源. String fileName: 文件路径,File file: 一个文件对象
     *      作用:1.创建FileReader对象;2.将FileReader对象指向要读取的文件
     *  字符输入流的使用步骤:
     *      1.创建FileReader对象,构造方法中绑定要读取的数据源
     *      2.使用FileReader对象中的read()方法读取文件
     *      3.释放资源
     * */
    public static void test009() throws IOException {
        FileReader fileReader = new FileReader("D:\\Dev\\Projects\\GitLab\\relax-framework-parent\\exercise\\src\\cache\\test008.txt");
        int byteCache = 0;
        while ((byteCache = fileReader.read())!=-1){
            System.out.println((char) byteCache);
        }

//        /** 存储一次读取出来的1024个字符(注意 这里是字符) */
//        char[] chars = new char[1024];
//        /** 记录 每次 一次 读取出来的字符个数 */
//        Integer len = 0;
//        while ((len=fileReader.read(chars))!=-1){
//            /** String的构造方法
//             * String(char value[]) 将字符数组转换为字符串
//             * String(char value[], int offset, int count):  @offset:开始的下标,@count:从开始下标开始往后多少个字符
//             * */
//            System.out.println(new String(chars,0,9));
//        }
    }

    /**
     * java.io.Writer: 字符输出流,是所有字符输出流最顶层的父类,是一个抽象类
     * 共性的成员方法:
     *      void write(int c) 写入单个字符
     *      void write(char[] chars,int offset,int length) 写入字符数组的某一部分,offset数组的开始索引,length写的字符个数.
     *      void write(String str) 写入字符串
     *      void write(String str,int offset,int length) 写入字符串的某一部分,offset字符串的开始索引,length写的字符个数
     *      void flush() 刷新该流的缓冲
     *      void close() 关闭此流,但要先刷新该流.
     *
     * java.io.FileWriter extend OutputStream extends Writer
     * FileWriter:文件字符输出流
     *  作用: 把内存中的字符数据写入到文件中
     *   构造方法: FileWriter(String fileName,boolean append),FileWriter(File file,boolean append)
     *   参数:用于指定输出的文件的目的地. String fileName: 文件路径,File file: 一个文件对象,
     *          boolean append: true 不会创建新的文件覆盖原文件 false 创建新的文件覆盖原文件
     *   作用:创建一个FileWriter对象;会根据构造方法中传递的文件/文件的路径,创建文件;将FileWriter对象指向创建好的文件
     *
     *  字符输入流的使用步骤:
     *  1.创建FileWriter对象,构造方法中绑定要写入数据的目的地
     *  2.使用FileWriter对象中的write()方法 将数据写入到内存缓冲区中(字符转化为字节的过程)
     *  3.使用FileWriter中的方法flush,把内存缓冲区中的数据,刷新到文件中
     *  4.释放资源(会先把内存缓冲区中的数据刷新到文件中)
     *  注意:
     *      字节流输出的话是直接写入到硬盘中去;
     *      而此处的字符流输出的话是先写到内存后再写到硬盘中去;
     *
     *  换行符号:
     *      windows:    \r\n
     *      linux:      /n
     *      mac:        /r
     * */
    public static void test010() throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\Dev\\Projects\\GitLab\\relax-framework-parent\\exercise\\src\\cache\\test010.txt",true);
        fileWriter.write(65);
        char[] chars = {'\n','人','生','我','的','卡','路','里'};
        fileWriter.write(chars);
        fileWriter.write(chars,0,3);
        fileWriter.write("\n我是个字符串\n");
        fileWriter.write("我是个字符串\n",1,6);
        fileWriter.flush();
        fileWriter.close();
    }
}
