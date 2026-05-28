package com.duytan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testCoNghiem() {

        String ketQua =
                App.giaiPhuongTrinhBac1(2, -4);

        assertEquals(
                "Phuong trinh co nghiem x = 2.0",
                ketQua
        );
    }

    @Test
    public void testVoNghiem() {

        String ketQua =
                App.giaiPhuongTrinhBac1(0, 5);

        assertEquals(
                "Phuong trinh vo nghiem",
                ketQua
        );
    }

    @Test
    public void testVoSoNghiem() {

        String ketQua =
                App.giaiPhuongTrinhBac1(0, 0);

        assertEquals(
                "Phuong trinh vo so nghiem",
                ketQua
        );
    }
}