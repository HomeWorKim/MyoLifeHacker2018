package blueberrycheese.myolifehacker.events;

import android.bluetooth.BluetoothDevice;

import blueberrycheese.myolifehacker.MyoApp;
import blueberrycheese.myolifehacker.myo_manage.IGestureDetectModel;



public class ServiceEvent {
    private MyoApp myoApp_ = null;
    public static class MyoDeviceEvent{

        public BluetoothDevice MyoDevice;

        public MyoDeviceEvent(BluetoothDevice device){
            this.MyoDevice = device;
        }
    }

    public static class GestureEvent_forService{

            public int gestureNumber;

            public GestureEvent_forService(int i_element){
                this.gestureNumber = i_element;
            }
    }

    public static class GestureEvent_forMusic {

        public int gestureNumber;

        public GestureEvent_forMusic(int i_element) {
            this.gestureNumber = i_element;
        }
    }

    public static class GestureEvent{

        public int gestureNumber;

        public GestureEvent(int i_element){
            this.gestureNumber = i_element;
        }
    }


    public static class VibrateEvent{
        public int vibrateNum;
        public VibrateEvent(int vNum){
            this.vibrateNum = vNum;
        }
    }

    public static class restartLockTimerEvent{
        public int addDelay = 0;
        public restartLockTimerEvent(int addDelay){
            this.addDelay = addDelay;
        }
    }

    public static class currentActivity_Event{
        public int currentActivity;
        public currentActivity_Event(int currentActivity){
            this.currentActivity = currentActivity;
        }
    }

    public static class setDetectModel_Event{
        public int set;

        public setDetectModel_Event(int set){
            this.set = set;
        }
    }

    public static class myoConnected_Event{
        public boolean connection;
        public myoConnected_Event(boolean flag){
            this.connection = flag;
        }
    }


    public static class SettingEvent{
        public int lock_vibrate_p;
        public int recog_vibrate_p;
        public int conn_vibrate_p;
        public boolean is_vibrate;
        public int recognizing_Num;
        public SettingEvent(int vNum,int vNum1,int vNum2,boolean is_v,int rNum){
            this.lock_vibrate_p = vNum;
            this.recog_vibrate_p = vNum1;
            this.conn_vibrate_p = vNum2;
            is_vibrate = is_v;
            recognizing_Num = rNum;
        }
    }


    public static class myoLock_Event{
        public boolean lock;
        public myoLock_Event(boolean flag){
            this.lock = flag ;
        }
    }

    public static class reCreateDetectM_Event{

    }

    public static class startActivity_Event{

    }

    ///////Test

    public static class DetectModel{
        public IGestureDetectModel detectModel;

        public DetectModel(IGestureDetectModel model){
            this.detectModel = model;
        }
    }

    public static class MyoDevice_StringEvent{

        public String MyoDevice_String;

        public MyoDevice_StringEvent(String device){
            this.MyoDevice_String = device;
        }
    }

    public static class testEvent{
        public String text;
        public testEvent(String text){
            this.text = text;
        }
    }



}
