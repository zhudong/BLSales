package com.pactera.blsales.util;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class ImageUtils {
	
	/**
	 * 转变图片到指定大小
	 * @param zoomWidth
	 * @param zoomHeiht
	 * @param bitmap
	 * @return
	 */
	public static Bitmap zoomImage(int zoomWidth, int zoomHeiht, Bitmap bitmap)
	{
		Matrix matrix = new Matrix();
		if (bitmap == null)
		{
			return null;
		}
		int width = bitmap.getWidth();
		int height = bitmap.getHeight();

		int newWidth = zoomWidth;
		int newHeight = zoomHeiht;

		float scaleWidth = ((float) newWidth) / width;
		float scaleHeight = ((float) newHeight) / height;

		matrix.postScale(scaleWidth, scaleHeight);

		Bitmap resizedBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);

		return resizedBitmap;
	}
}
