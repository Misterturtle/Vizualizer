package com.pillartechnology.visualizer;

import android.os.Bundle;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.*;

public class MainActivityImplTest {

    @Mock private MainActivity mainActivityMock;
    @Mock private TextView mainTextViewMock;
    @Mock private Bundle mockBundle;

    private MainActivityImpl subject;

    @Before
    public void setUp() {
        initMocks(this);

        when(mainActivityMock.findViewById(R.id.main_text)).thenReturn(mainTextViewMock);
        subject = new MainActivityImpl(mainActivityMock);
        subject.onCreate(mockBundle);
    }

    @Test
    public void mainActivitySetsMainText() {
        verify(mainTextViewMock).setText("Bigfoot was here");
    }
}