package ru.speedfire.broadcasttest;


        import android.content.ComponentName;
        import android.content.Context;
        import android.content.Intent;
        import android.content.ServiceConnection;
        import android.os.IBinder;
        import android.os.RemoteException;
        import ru.speedfire.broadcasttest.IProxyConnet;
        import ru.speedfire.broadcasttest.IProxyConnet.Stub;

public class FlyNavigator {
    private static FlyNavigator mFlyNavigator = null;
    private ServiceConnection conn = new ServiceConnection() {
        public synchronized void onServiceConnected(ComponentName name, IBinder service) {
            FlyNavigator.this.mIProxyConnet = Stub.asInterface(service);
            FlyNavigator.this.flag = true;
        }

        public void onServiceDisconnected(ComponentName name) {
            FlyNavigator.this.mIProxyConnet = null;
            FlyNavigator.this.flag = false;
        }
    };
    Context context;
    boolean flag = false;
    public IProxyConnet mIProxyConnet;

    public class AdapterCenter {
        public void openFunction(int value) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.openFunction(value);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendFlyKey(int value) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendFlyKey(value);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendKey(int value) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendKey(value);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendPanelKeyControl(int key0, int key1) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendPanelKeyControl(key0, key1);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendFlyAppManger(int key0, int key1) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendFlyAppManger(key0, key1);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendVolumeSize(byte value) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendVolumeSize(value);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendVolumMax() {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendVolumMax();
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendVolumMin() {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendVolumMin();
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void radioSearch(int num) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendScan(num);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendControlRadio(int value) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendControlRadio(value);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendFM(float frequency) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendFM(frequency);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendAM(float frequency) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendAM(frequency);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendDvdPlayControl(int key) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendDvdPlayControl(key);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendCarBodyControl(int key0, int key1) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendCarBodyControl(key0, key1);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendAirCinditionControl(int key) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendAirCinditionControl(key);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendTemControl(int key) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendTemControl(key);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendAirCinditionMode(int key) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendAirCinditionMode(key);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendWindDirection(int key) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendWindDirection(key);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendWindPower(int key) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendWindPower(key);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendTemDecDegerees(byte degree) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendTemDecDegerees(degree);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendTemIncDegerees(byte degree) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendTemIncDegerees(degree);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendTemToDegrees(byte degree) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendTemToDegrees(degree);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendVolumeChange(byte arg0) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendVolumeChange(arg0);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendCallBTPhone(String number) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendCallBTPhone(number);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void sendRequestBTPhoneBook() {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.sendRequestBTPhoneBook();
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        public void setMicMode(int mode) {
            try {
                if (FlyNavigator.this.mIProxyConnet != null) {
                    FlyNavigator.this.mIProxyConnet.setMicMode(mode);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    private FlyNavigator() {
    }

    private FlyNavigator(Context context) {
        this.context = context;
        context.bindService(new Intent("com.flyaudio.nativeservice.IProxyService"), this.conn, 1);
    }

    public static synchronized FlyNavigator getInstance(Context context) {
        FlyNavigator flyNavigator;
        synchronized (FlyNavigator.class) {
            if (mFlyNavigator == null) {
                mFlyNavigator = new FlyNavigator(context);
            }
            flyNavigator = mFlyNavigator;
        }
        return flyNavigator;
    }

    public void unbindService() {
        if (this.flag) {
            this.context.unbindService(this.conn);
        }
        this.flag = false;
    }
}