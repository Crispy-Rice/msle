package com.yuantu.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.lang3.StringUtils;
import org.krysalis.barcode4j.impl.upcean.EAN13Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;
import org.krysalis.barcode4j.tools.UnitConv;

public class BarcodeUtil {

    /**
          * 根据提供的订单号(12位)在指定路径下生成条形码
          *
          * @param msg 条形码
          * @param path 路径
          * @return picture
          */
    public static File generateFile(String msg, String path) {
        File file = new File(path);
        try {
            generate(msg, new FileOutputStream(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return file;
    }

    /**
          * 生成字节
          *
          * @param msg
          * @return
          */
    public static byte[] generate(String msg) {
        ByteArrayOutputStream ous = new ByteArrayOutputStream();
        generate(msg, ous);
        return ous.toByteArray();
    }

    /**
          * 生成到流
          *
          * @param msg
          * @param ous
          */
    public static void generate(String msg, OutputStream ous) {
        if (StringUtils.isEmpty(msg) || ous == null) {
            return;
        }

        EAN13Bean bean = new EAN13Bean();

// 精细度
        final int dpi = 130;
// module宽度
        final double moduleWidth = UnitConv.in2mm(1.0f / dpi);

// 配置对象
        bean.setModuleWidth(moduleWidth);
// bean.setWideFactor(3);
// msg高度
        bean.setBarHeight(3);
// 白边显示
        bean.doQuietZone(true);

        String format = "image/png";
        try {

// 输出到流
            BitmapCanvasProvider canvas = new BitmapCanvasProvider(ous, format, dpi, BufferedImage.TYPE_BYTE_BINARY,
                    false, 0);

// 生成条形码
            bean.generateBarcode(canvas, msg);

// 结束绘制
            canvas.finish();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//public static void main(String[] args) {
//    String msg = "584780923411";
//String path = "C:/Users/Administrator/Desktop/条形码/"+msg+".png";
//generateFile(msg, path);
//}
}


