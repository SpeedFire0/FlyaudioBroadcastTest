package ru.speedfire.broadcasttest;


        import android.os.Binder;
        import android.os.IBinder;
        import android.os.IInterface;
        import android.os.Parcel;
        import android.os.RemoteException;

public interface IProxyConnet extends IInterface {

    public static abstract class Stub extends Binder implements IProxyConnet {
        private static final String DESCRIPTOR = "com.flyaudio.proxyservice.aidl.IProxyConnet";
        static final int TRANSACTION_openFunction = 1;
        static final int TRANSACTION_sendAM = 61;
        static final int TRANSACTION_sendAirCinditionControl = 67;
        static final int TRANSACTION_sendAirCinditionMode = 72;
        static final int TRANSACTION_sendBarcodeInfo = 9;
        static final int TRANSACTION_sendCallBTPhone = 76;
        static final int TRANSACTION_sendCarBodyControl = 64;
        static final int TRANSACTION_sendControlBT = 75;
        static final int TRANSACTION_sendControlRadio = 57;
        static final int TRANSACTION_sendControlVolum = 55;
        static final int TRANSACTION_sendCurrentRoadNameUni = 38;
        static final int TRANSACTION_sendCurrentRoadNameUtf = 49;
        static final int TRANSACTION_sendCurrentRoadType = 40;
        static final int TRANSACTION_sendCurrentSpeed = 41;
        static final int TRANSACTION_sendCurrentZoneName = 46;
        static final int TRANSACTION_sendDataToNavi = 13;
        static final int TRANSACTION_sendDebugInfo = 11;
        static final int TRANSACTION_sendDestinationDistance = 34;
        static final int TRANSACTION_sendDistance = 33;
        static final int TRANSACTION_sendDrivingPosition = 48;
        static final int TRANSACTION_sendDvdPlayControl = 63;
        static final int TRANSACTION_sendFM = 60;
        static final int TRANSACTION_sendFlyAppManger = 66;
        static final int TRANSACTION_sendFlyKey = 2;
        static final int TRANSACTION_sendGalaxyPowerAction = 8;
        static final int TRANSACTION_sendGpsAngle = 43;
        static final int TRANSACTION_sendJumpPage = 4;
        static final int TRANSACTION_sendKey = 3;
        static final int TRANSACTION_sendKeyDest = 23;
        static final int TRANSACTION_sendKeyFan = 25;
        static final int TRANSACTION_sendKeyLCD = 26;
        static final int TRANSACTION_sendKeyMedia = 20;
        static final int TRANSACTION_sendKeyNavi = 22;
        static final int TRANSACTION_sendKeySeek = 21;
        static final int TRANSACTION_sendKeyVol = 24;
        static final int TRANSACTION_sendLimitSpeed = 42;
        static final int TRANSACTION_sendListenRadio = 58;
        static final int TRANSACTION_sendMediaPlayStatus = 15;
        static final int TRANSACTION_sendMp3CurrentTrack = 31;
        static final int TRANSACTION_sendMp3Name = 29;
        static final int TRANSACTION_sendMp3Status = 27;
        static final int TRANSACTION_sendMp3Time = 28;
        static final int TRANSACTION_sendMp3TotalTrack = 30;
        static final int TRANSACTION_sendNaviVoice = 6;
        static final int TRANSACTION_sendNextRoadNameUni = 39;
        static final int TRANSACTION_sendNextRoadNameUtf = 50;
        static final int TRANSACTION_sendOpenDebugPassword = 51;
        static final int TRANSACTION_sendOsdDisappear = 5;
        static final int TRANSACTION_sendPaneType = 12;
        static final int TRANSACTION_sendPanelKeyControl = 65;
        static final int TRANSACTION_sendQuickSwitch = 18;
        static final int TRANSACTION_sendQuickSwitchAcc = 17;
        static final int TRANSACTION_sendQuickSwitchModule = 19;
        static final int TRANSACTION_sendQuickSwitchPower = 16;
        static final int TRANSACTION_sendRemainderTime = 36;
        static final int TRANSACTION_sendRequestBTPhoneBook = 77;
        static final int TRANSACTION_sendRequestVoice = 7;
        static final int TRANSACTION_sendRoundaboutExitCount = 45;
        static final int TRANSACTION_sendRoundaboutExitNumbers = 44;
        static final int TRANSACTION_sendSIMState = 10;
        static final int TRANSACTION_sendScan = 62;
        static final int TRANSACTION_sendScreenBrightness = 14;
        static final int TRANSACTION_sendSearchRadio = 59;
        static final int TRANSACTION_sendSteeringInfoValue = 47;
        static final int TRANSACTION_sendTemControl = 71;
        static final int TRANSACTION_sendTemDecDegerees = 70;
        static final int TRANSACTION_sendTemIncDegerees = 69;
        static final int TRANSACTION_sendTemToDegrees = 68;
        static final int TRANSACTION_sendTotalDistance = 35;
        static final int TRANSACTION_sendTotalTime = 37;
        static final int TRANSACTION_sendTurnDirection = 32;
        static final int TRANSACTION_sendVolumMax = 53;
        static final int TRANSACTION_sendVolumMin = 54;
        static final int TRANSACTION_sendVolumeChange = 56;
        static final int TRANSACTION_sendVolumeSize = 52;
        static final int TRANSACTION_sendWindDirection = 73;
        static final int TRANSACTION_sendWindPower = 74;
        static final int TRANSACTION_setControlFan = 81;
        static final int TRANSACTION_setControlKLDCall = 80;
        static final int TRANSACTION_setControlScreen = 79;
        static final int TRANSACTION_setMicMode = 78;

        private static class Proxy implements IProxyConnet {
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public void openFunction(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_openFunction, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendFlyKey(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendFlyKey, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendKey(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendKey, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendJumpPage() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_sendJumpPage, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendOsdDisappear() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_sendOsdDisappear, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendNaviVoice(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendNaviVoice, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendRequestVoice(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendRequestVoice, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendGalaxyPowerAction(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendGalaxyPowerAction, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendBarcodeInfo() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_sendBarcodeInfo, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendSIMState(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendSIMState, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendDebugInfo(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendDebugInfo, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendPaneType(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendPaneType, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendDataToNavi(String data) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeString(data);
                    this.mRemote.transact(Stub.TRANSACTION_sendDataToNavi, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendScreenBrightness(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendScreenBrightness, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendMediaPlayStatus(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendMediaPlayStatus, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendQuickSwitchPower(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendQuickSwitchPower, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendQuickSwitchAcc(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendQuickSwitchAcc, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendQuickSwitch(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendQuickSwitch, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendQuickSwitchModule(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendQuickSwitchModule, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendKeyMedia() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_sendKeyMedia, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendKeySeek(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendKeySeek, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendKeyNavi() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_sendKeyNavi, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendKeyDest() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_sendKeyDest, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendKeyVol(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendKeyVol, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendKeyFan(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendKeyFan, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendKeyLCD(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendKeyLCD, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendMp3Status(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendMp3Status, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendMp3Time(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendMp3Time, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendMp3Name(String name) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeString(name);
                    this.mRemote.transact(Stub.TRANSACTION_sendMp3Name, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendMp3TotalTrack(int track) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(track);
                    this.mRemote.transact(Stub.TRANSACTION_sendMp3TotalTrack, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendMp3CurrentTrack(int currentTrack) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(currentTrack);
                    this.mRemote.transact(Stub.TRANSACTION_sendMp3CurrentTrack, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendTurnDirection(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendTurnDirection, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendDistance(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendDistance, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendDestinationDistance(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendDestinationDistance, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendTotalDistance(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendTotalDistance, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendRemainderTime(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendRemainderTime, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendTotalTime(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendTotalTime, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendCurrentRoadNameUni(String value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeString(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendCurrentRoadNameUni, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendNextRoadNameUni(String value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeString(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendNextRoadNameUni, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendCurrentRoadType(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendCurrentRoadType, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendCurrentSpeed(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendCurrentSpeed, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendLimitSpeed(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendLimitSpeed, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendGpsAngle(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendGpsAngle, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendRoundaboutExitNumbers(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendRoundaboutExitNumbers, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendRoundaboutExitCount(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendRoundaboutExitCount, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendCurrentZoneName(String value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeString(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendCurrentZoneName, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendSteeringInfoValue(String value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeString(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendSteeringInfoValue, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendDrivingPosition(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendDrivingPosition, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendCurrentRoadNameUtf(String value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeString(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendCurrentRoadNameUtf, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendNextRoadNameUtf(String value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeString(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendNextRoadNameUtf, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendOpenDebugPassword(int password) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(password);
                    this.mRemote.transact(Stub.TRANSACTION_sendOpenDebugPassword, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendVolumeSize(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendVolumeSize, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendVolumMax() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_sendVolumMax, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendVolumMin() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_sendVolumMin, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendControlVolum(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendControlVolum, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendVolumeChange(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendVolumeChange, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendControlRadio(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendControlRadio, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendListenRadio(String name) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeString(name);
                    this.mRemote.transact(Stub.TRANSACTION_sendListenRadio, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendSearchRadio(String type) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeString(type);
                    this.mRemote.transact(Stub.TRANSACTION_sendSearchRadio, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendFM(float frequency) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeFloat(frequency);
                    this.mRemote.transact(Stub.TRANSACTION_sendFM, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendAM(float frequency) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeFloat(frequency);
                    this.mRemote.transact(Stub.TRANSACTION_sendAM, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendScan(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendScan, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendDvdPlayControl(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendDvdPlayControl, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendCarBodyControl(int key0, int key1) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key0);
                    _data.writeInt(key1);
                    this.mRemote.transact(Stub.TRANSACTION_sendCarBodyControl, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendPanelKeyControl(int key0, int key1) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key0);
                    _data.writeInt(key1);
                    this.mRemote.transact(Stub.TRANSACTION_sendPanelKeyControl, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendFlyAppManger(int key0, int key1) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key0);
                    _data.writeInt(key1);
                    this.mRemote.transact(Stub.TRANSACTION_sendFlyAppManger, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendAirCinditionControl(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendAirCinditionControl, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendTemToDegrees(int degree) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(degree);
                    this.mRemote.transact(Stub.TRANSACTION_sendTemToDegrees, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendTemIncDegerees(int degree) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(degree);
                    this.mRemote.transact(Stub.TRANSACTION_sendTemIncDegerees, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendTemDecDegerees(int degree) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(degree);
                    this.mRemote.transact(Stub.TRANSACTION_sendTemDecDegerees, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendTemControl(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendTemControl, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendAirCinditionMode(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendAirCinditionMode, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendWindDirection(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendWindDirection, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendWindPower(int key) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(key);
                    this.mRemote.transact(Stub.TRANSACTION_sendWindPower, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendControlBT(int value) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(value);
                    this.mRemote.transact(Stub.TRANSACTION_sendControlBT, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendCallBTPhone(String phone) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeString(phone);
                    this.mRemote.transact(Stub.TRANSACTION_sendCallBTPhone, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void sendRequestBTPhoneBook() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_sendRequestBTPhoneBook, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void setMicMode(int mode) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(mode);
                    this.mRemote.transact(Stub.TRANSACTION_setMicMode, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void setControlScreen(int mode) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(mode);
                    this.mRemote.transact(Stub.TRANSACTION_setControlScreen, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void setControlKLDCall(String number) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeString(number);
                    this.mRemote.transact(Stub.TRANSACTION_setControlKLDCall, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            public void setControlFan(int mode) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(mode);
                    this.mRemote.transact(Stub.TRANSACTION_setControlFan, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IProxyConnet asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (iin == null || !(iin instanceof IProxyConnet)) {
                return new Proxy(obj);
            }
            return (IProxyConnet) iin;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case TRANSACTION_openFunction /*1*/:
                    data.enforceInterface(DESCRIPTOR);
                    openFunction(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendFlyKey /*2*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendFlyKey(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendKey /*3*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendKey(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendJumpPage /*4*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendJumpPage();
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendOsdDisappear /*5*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendOsdDisappear();
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendNaviVoice /*6*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendNaviVoice(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendRequestVoice /*7*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendRequestVoice(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendGalaxyPowerAction /*8*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendGalaxyPowerAction(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendBarcodeInfo /*9*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendBarcodeInfo();
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendSIMState /*10*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendSIMState(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendDebugInfo /*11*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendDebugInfo(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendPaneType /*12*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendPaneType(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendDataToNavi /*13*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendDataToNavi(data.readString());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendScreenBrightness /*14*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendScreenBrightness(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendMediaPlayStatus /*15*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendMediaPlayStatus(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendQuickSwitchPower /*16*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendQuickSwitchPower(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendQuickSwitchAcc /*17*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendQuickSwitchAcc(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendQuickSwitch /*18*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendQuickSwitch(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendQuickSwitchModule /*19*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendQuickSwitchModule(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendKeyMedia /*20*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendKeyMedia();
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendKeySeek /*21*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendKeySeek(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendKeyNavi /*22*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendKeyNavi();
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendKeyDest /*23*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendKeyDest();
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendKeyVol /*24*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendKeyVol(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendKeyFan /*25*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendKeyFan(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendKeyLCD /*26*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendKeyLCD(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendMp3Status /*27*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendMp3Status(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendMp3Time /*28*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendMp3Time(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendMp3Name /*29*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendMp3Name(data.readString());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendMp3TotalTrack /*30*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendMp3TotalTrack(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendMp3CurrentTrack /*31*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendMp3CurrentTrack(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendTurnDirection /*32*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendTurnDirection(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendDistance /*33*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendDistance(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendDestinationDistance /*34*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendDestinationDistance(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendTotalDistance /*35*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendTotalDistance(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendRemainderTime /*36*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendRemainderTime(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendTotalTime /*37*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendTotalTime(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendCurrentRoadNameUni /*38*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendCurrentRoadNameUni(data.readString());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendNextRoadNameUni /*39*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendNextRoadNameUni(data.readString());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendCurrentRoadType /*40*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendCurrentRoadType(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendCurrentSpeed /*41*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendCurrentSpeed(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendLimitSpeed /*42*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendLimitSpeed(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendGpsAngle /*43*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendGpsAngle(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendRoundaboutExitNumbers /*44*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendRoundaboutExitNumbers(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendRoundaboutExitCount /*45*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendRoundaboutExitCount(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendCurrentZoneName /*46*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendCurrentZoneName(data.readString());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendSteeringInfoValue /*47*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendSteeringInfoValue(data.readString());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendDrivingPosition /*48*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendDrivingPosition(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendCurrentRoadNameUtf /*49*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendCurrentRoadNameUtf(data.readString());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendNextRoadNameUtf /*50*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendNextRoadNameUtf(data.readString());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendOpenDebugPassword /*51*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendOpenDebugPassword(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendVolumeSize /*52*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendVolumeSize(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendVolumMax /*53*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendVolumMax();
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendVolumMin /*54*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendVolumMin();
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendControlVolum /*55*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendControlVolum(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendVolumeChange /*56*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendVolumeChange(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendControlRadio /*57*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendControlRadio(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendListenRadio /*58*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendListenRadio(data.readString());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendSearchRadio /*59*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendSearchRadio(data.readString());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendFM /*60*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendFM(data.readFloat());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendAM /*61*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendAM(data.readFloat());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendScan /*62*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendScan(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendDvdPlayControl /*63*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendDvdPlayControl(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendCarBodyControl /*64*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendCarBodyControl(data.readInt(), data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendPanelKeyControl /*65*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendPanelKeyControl(data.readInt(), data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendFlyAppManger /*66*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendFlyAppManger(data.readInt(), data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendAirCinditionControl /*67*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendAirCinditionControl(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendTemToDegrees /*68*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendTemToDegrees(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendTemIncDegerees /*69*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendTemIncDegerees(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendTemDecDegerees /*70*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendTemDecDegerees(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendTemControl /*71*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendTemControl(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendAirCinditionMode /*72*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendAirCinditionMode(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendWindDirection /*73*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendWindDirection(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendWindPower /*74*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendWindPower(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendControlBT /*75*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendControlBT(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendCallBTPhone /*76*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendCallBTPhone(data.readString());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_sendRequestBTPhoneBook /*77*/:
                    data.enforceInterface(DESCRIPTOR);
                    sendRequestBTPhoneBook();
                    reply.writeNoException();
                    return true;
                case TRANSACTION_setMicMode /*78*/:
                    data.enforceInterface(DESCRIPTOR);
                    setMicMode(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_setControlScreen /*79*/:
                    data.enforceInterface(DESCRIPTOR);
                    setControlScreen(data.readInt());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_setControlKLDCall /*80*/:
                    data.enforceInterface(DESCRIPTOR);
                    setControlKLDCall(data.readString());
                    reply.writeNoException();
                    return true;
                case TRANSACTION_setControlFan /*81*/:
                    data.enforceInterface(DESCRIPTOR);
                    setControlFan(data.readInt());
                    reply.writeNoException();
                    return true;
                case 1598968902:
                    reply.writeString(DESCRIPTOR);
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }
    }

    void openFunction(int i) throws RemoteException;

    void sendAM(float f) throws RemoteException;

    void sendAirCinditionControl(int i) throws RemoteException;

    void sendAirCinditionMode(int i) throws RemoteException;

    void sendBarcodeInfo() throws RemoteException;

    void sendCallBTPhone(String str) throws RemoteException;

    void sendCarBodyControl(int i, int i2) throws RemoteException;

    void sendControlBT(int i) throws RemoteException;

    void sendControlRadio(int i) throws RemoteException;

    void sendControlVolum(int i) throws RemoteException;

    void sendCurrentRoadNameUni(String str) throws RemoteException;

    void sendCurrentRoadNameUtf(String str) throws RemoteException;

    void sendCurrentRoadType(int i) throws RemoteException;

    void sendCurrentSpeed(int i) throws RemoteException;

    void sendCurrentZoneName(String str) throws RemoteException;

    void sendDataToNavi(String str) throws RemoteException;

    void sendDebugInfo(int i) throws RemoteException;

    void sendDestinationDistance(int i) throws RemoteException;

    void sendDistance(int i) throws RemoteException;

    void sendDrivingPosition(int i) throws RemoteException;

    void sendDvdPlayControl(int i) throws RemoteException;

    void sendFM(float f) throws RemoteException;

    void sendFlyAppManger(int i, int i2) throws RemoteException;

    void sendFlyKey(int i) throws RemoteException;

    void sendGalaxyPowerAction(int i) throws RemoteException;

    void sendGpsAngle(int i) throws RemoteException;

    void sendJumpPage() throws RemoteException;

    void sendKey(int i) throws RemoteException;

    void sendKeyDest() throws RemoteException;

    void sendKeyFan(int i) throws RemoteException;

    void sendKeyLCD(int i) throws RemoteException;

    void sendKeyMedia() throws RemoteException;

    void sendKeyNavi() throws RemoteException;

    void sendKeySeek(int i) throws RemoteException;

    void sendKeyVol(int i) throws RemoteException;

    void sendLimitSpeed(int i) throws RemoteException;

    void sendListenRadio(String str) throws RemoteException;

    void sendMediaPlayStatus(int i) throws RemoteException;

    void sendMp3CurrentTrack(int i) throws RemoteException;

    void sendMp3Name(String str) throws RemoteException;

    void sendMp3Status(int i) throws RemoteException;

    void sendMp3Time(int i) throws RemoteException;

    void sendMp3TotalTrack(int i) throws RemoteException;

    void sendNaviVoice(int i) throws RemoteException;

    void sendNextRoadNameUni(String str) throws RemoteException;

    void sendNextRoadNameUtf(String str) throws RemoteException;

    void sendOpenDebugPassword(int i) throws RemoteException;

    void sendOsdDisappear() throws RemoteException;

    void sendPaneType(int i) throws RemoteException;

    void sendPanelKeyControl(int i, int i2) throws RemoteException;

    void sendQuickSwitch(int i) throws RemoteException;

    void sendQuickSwitchAcc(int i) throws RemoteException;

    void sendQuickSwitchModule(int i) throws RemoteException;

    void sendQuickSwitchPower(int i) throws RemoteException;

    void sendRemainderTime(int i) throws RemoteException;

    void sendRequestBTPhoneBook() throws RemoteException;

    void sendRequestVoice(int i) throws RemoteException;

    void sendRoundaboutExitCount(int i) throws RemoteException;

    void sendRoundaboutExitNumbers(int i) throws RemoteException;

    void sendSIMState(int i) throws RemoteException;

    void sendScan(int i) throws RemoteException;

    void sendScreenBrightness(int i) throws RemoteException;

    void sendSearchRadio(String str) throws RemoteException;

    void sendSteeringInfoValue(String str) throws RemoteException;

    void sendTemControl(int i) throws RemoteException;

    void sendTemDecDegerees(int i) throws RemoteException;

    void sendTemIncDegerees(int i) throws RemoteException;

    void sendTemToDegrees(int i) throws RemoteException;

    void sendTotalDistance(int i) throws RemoteException;

    void sendTotalTime(int i) throws RemoteException;

    void sendTurnDirection(int i) throws RemoteException;

    void sendVolumMax() throws RemoteException;

    void sendVolumMin() throws RemoteException;

    void sendVolumeChange(int i) throws RemoteException;

    void sendVolumeSize(int i) throws RemoteException;

    void sendWindDirection(int i) throws RemoteException;

    void sendWindPower(int i) throws RemoteException;

    void setControlFan(int i) throws RemoteException;

    void setControlKLDCall(String str) throws RemoteException;

    void setControlScreen(int i) throws RemoteException;

    void setMicMode(int i) throws RemoteException;
}