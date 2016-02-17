package ru.speedfire.broadcasttest;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends Activity {

    final String LOG_TAG = "myLogs";

    final int TASK1_CODE = 1;
    final int TASK2_CODE = 2;
    final int TASK3_CODE = 3;

    public final static int STATUS_START = 100;
    public final static int STATUS_FINISH = 200;
    private FlyNavigator mFlyNavigator;

    public final static String INTENT_ACTION = "action";
    public final static String EXTRA_NAME = "time";
    public final static String EXTRA_VALUE = "0";
    public final static String PARAM_RESULT = "result";
    public final static String PARAM_STATUS = "status";

    public final static String BROADCAST_ACTION = "ru.speedfire.broadcasttest";

    private ServiceConnection conn = new ServiceConnection() {
        public synchronized void onServiceConnected(ComponentName name, IBinder service) {
            MainActivity.this.mIProxyConnet = IProxyConnet.Stub.asInterface(service);
            MainActivity.this.flag = true;
        }

        public void onServiceDisconnected(ComponentName name) {
            MainActivity.this.mIProxyConnet = null;
            MainActivity.this.flag = false;
        }
    };
    Context context;
    boolean flag = false;
    public IProxyConnet mIProxyConnet;


    TextView tvTask1;
    TextView tvTask2;
    TextView tvTask3;
    BroadcastReceiver br;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tvTask1 = (TextView) findViewById(R.id.tvTask1);
        tvTask1.setText("Кнопка: ");
        tvTask2 = (TextView) findViewById(R.id.tvTask2);
        tvTask2.setText("Ожидаемый результат: ");
        tvTask3 = (TextView) findViewById(R.id.tvTask3);
        tvTask3.setText("");

        // создаем BroadcastReceiver
/*        br = new BroadcastReceiver() {
            // действия при получении сообщений
            public void onReceive(Context context, Intent intent) {
                int task = intent.getIntExtra(PARAM_TASK, 0);
                int status = intent.getIntExtra(PARAM_STATUS, 0);
                Log.d(LOG_TAG, "onReceive: task = " + task + ", status = " + status);

                // Ловим сообщения о старте задач
                if (status  == STATUS_START) {
                    switch (task) {
                        case TASK1_CODE:
                            tvTask1.setText("Task1 start");
                            break;
                        case TASK2_CODE:
                            tvTask2.setText("Task2 start");
                            break;
                        case TASK3_CODE:
                            tvTask3.setText("Task3 start");
                            break;
                    }
                }

                // Ловим сообщения об окончании задач
                if (status == STATUS_FINISH) {
                    int result = intent.getIntExtra(PARAM_RESULT, 0);
                    switch (task) {
                        case TASK1_CODE:
                            tvTask1.setText("Task1 finish, result = " + result);
                            break;
                        case TASK2_CODE:
                            tvTask2.setText("Task2 finish, result = " + result);
                            break;
                        case TASK3_CODE:
                            tvTask3.setText("Task3 finish, result = " + result);
                            break;
                    }
                }
            }
        };
        // создаем фильтр для BroadcastReceiver
        IntentFilter intFilt = new IntentFilter(BROADCAST_ACTION);
        // регистрируем (включаем) BroadcastReceiver
        registerReceiver(br, intFilt);*/
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // дерегистрируем (выключаем) BroadcastReceiver
//        unregisterReceiver(br);
    }


    public void onClick1(View v) {
        Intent intent;

        // Создаем Intent для вызова сервиса,
        // кладем туда параметр времени и код задачи
        intent = new Intent(this, MyService.class)
                .putExtra(INTENT_ACTION, "cn.flyaudio.action.CONTROL")
                .putExtra(EXTRA_NAME, "control")
                .putExtra(EXTRA_VALUE, "1");
        // стартуем сервис
        tvTask1.setText("Кнопка: 1");
        tvTask2.setText("Ожидаемый результат: Следующий трек во встроенном плеере");
        startService(intent);

    }


    public void onClick2(View v) {
        Intent intent;

        // Создаем Intent для вызова сервиса,
        // кладем туда параметр времени и код задачи
        intent = new Intent(this, MyService.class)
                .putExtra(INTENT_ACTION, "cn.flyaudio.action.notification.CONTROL_PLAY")
                .putExtra(EXTRA_NAME, "")
                .putExtra(EXTRA_VALUE, "");
        // стартуем сервис
        tvTask1.setText("Кнопка: 2");
        tvTask2.setText("Ожидаемый результат: Пауза/проигрывание во встроенном плеере");
        startService(intent);
    }


    public void onClick3(View v) {
        Intent intent;

        // Создаем Intent для вызова сервиса,
        // кладем туда параметр времени и код задачи
        intent = new Intent(this, MyService.class)
                .putExtra(INTENT_ACTION, "com.flyaudio.action.panelkey")
                .putExtra(EXTRA_NAME, "ButtonKey")
                .putExtra(EXTRA_VALUE, "1");
        // стартуем сервис
        tvTask1.setText("Кнопка: 3");
        tvTask2.setText("Ожидаемый результат: Кнопка на панели №1");
        startService(intent);

    }


    public void onClick4(View v) {
        Intent intent;

        // Создаем Intent для вызова сервиса,
        // кладем туда параметр времени и код задачи
        intent = new Intent(this, MyService.class)
                .putExtra(INTENT_ACTION, "com.flyaudio.action.radio")
                .putExtra(EXTRA_NAME, "radio")
                .putExtra(EXTRA_VALUE, "0");
        // стартуем сервис
        tvTask1.setText("Кнопка: 4");
        tvTask2.setText("Ожидаемый результат: Выключение радио");
        startService(intent);
    }


    public void onClick5(View v) {
//       Intent intent = new Intent("com.android.flyaudioui.volume");
//       intent.putExtra("key_volume", (byte) 13);
        // стартуем сервис
        Intent intent;
        intent = new Intent(this, MyService.class)
                .putExtra(INTENT_ACTION, "com.flyaudio.action.radio")
                .putExtra(EXTRA_NAME, "radio")
                .putExtra(EXTRA_VALUE, "1");
        tvTask1.setText("Кнопка: 5");
        tvTask2.setText("Ожидаемый результат: Включение радио");

    }


    public void onClick6(View v) {
        Intent intent;

        // Создаем Intent для вызова сервиса,
        // кладем туда параметр времени и код задачи
        intent = new Intent(this, MyService.class)
                .putExtra(INTENT_ACTION, "com.android.flyaudioui.volume")
                .putExtra(EXTRA_NAME, "key_volume")
                .putExtra(EXTRA_VALUE, "9");
        // стартуем сервис
        tvTask1.setText("Кнопка: 6");
        tvTask2.setText("Ожидаемый результат: Установка громкости на 9 (вариант 1)");
        startService(intent);
    }


    public void onClick7(View v) {
/*        Intent intent;
        intent = new Intent(this, MyService.class)
                .putExtra(INTENT_ACTION, "net.easyconn.a2dp.acquire")
                .putExtra(EXTRA_NAME, "")
                .putExtra(EXTRA_VALUE, "");
        startService(intent);
        // стартуем сервис*/
        Intent intent = new Intent();
        intent.setAction("com.android.flyaudioui.BackCarVideo");
        intent.setFlags(268435456);
        startActivity(intent);
        tvTask1.setText("Кнопка: 7");
        tvTask2.setText("Ожидаемый результат: Запуск BackCarVideo");

    }

    public void onClick8(View v) {
/*               Intent intent;
        intent = new Intent(this, MyService.class)
                .putExtra(INTENT_ACTION, "com.flyaudio.action.radio.scan")
                .putExtra(EXTRA_NAME, "")
                .putExtra(EXTRA_VALUE, "");
        // стартуем сервис
         startService(intent); */

        Intent intent = new Intent();
        intent.setAction("com.android.flyaudioui.TvVideo");
        intent.setFlags(268435456);
        startActivity(intent);
        tvTask1.setText("Кнопка: 8");
        tvTask2.setText("Ожидаемый результат: Запуск TvVideo");

    }

    public void onClick9(View v) {
/*         Intent intent;
        intent = new Intent(this, MyService.class)
                .putExtra(INTENT_ACTION, "com.flyservice.key")
                .putExtra(EXTRA_NAME, "keyid")
                .putExtra(EXTRA_VALUE, "3");
        startService(intent);*/
        Intent intent = new Intent();
        intent.setAction("com.android.flyaudioui.DvrVideo");
        intent.setFlags(268435456);
        startActivity(intent);
        tvTask1.setText("Кнопка: 9");
        tvTask2.setText("Ожидаемый результат: Запуск DvrVideo");

    }

    public void onClick10(View v) {
        Intent intent = new Intent();
        intent.setAction("com.android.flyaudioui.AuxVideo");
        intent.setFlags(268435456);
        startActivity(intent);
        tvTask1.setText("Кнопка: 10");
        tvTask2.setText("Ожидаемый результат: Запуск AuxVideo");

    }

    public void onClick11(View v) {
        Intent intent = new Intent();
        intent.setAction("com.android.flyaudioui.DvdVideo");
        intent.setFlags(268435456);
        startActivity(intent);
        tvTask1.setText("Кнопка: 11");
        tvTask2.setText("Ожидаемый результат: Запуск DvdVideo");

    }

    public void onClick12(View v) {
        Intent intent = new Intent();
        intent.setAction("com.android.flyaudioui.activity.UIDefaultActivity");
        intent.setFlags(268435456);
        startActivity(intent);
        tvTask1.setText("Кнопка: 12");
        tvTask2.setText("Ожидаемый результат: Запуск UIDefaultActivity");
    }

    public void onClick13(View v) {
        Intent intent = new Intent();
        intent.setAction("com.android.flyaudioui.FlyaudioUI");
        intent.setFlags(268435456);
        startActivity(intent);
        tvTask1.setText("Кнопка: 13");
        tvTask2.setText("Ожидаемый результат: Запуск FlyaudioUI");
    }

    public void onClick14(View v) throws RemoteException {
        Intent intent = new Intent();
        intent.setAction("com.android.launcher.Setup");
        intent.setFlags(268435456);
        startActivity(intent);
        tvTask1.setText("Кнопка: 14");
        tvTask2.setText("Ожидаемый результат: Запуск Setup");
    }

    public void onClick16(View v) throws RemoteException {
        MainActivity.this.mIProxyConnet.sendKeyVol(10);
        tvTask1.setText("Кнопка: 16");
        tvTask2.setText("Ожидаемый результат: sendVolumeChange на 10");
    }

    public void onClick15(View v) throws RemoteException {
          //    new AdapterCenter().sendKeyVol(15);
        Intent intent = new Intent();
        intent.setAction("android.speech.action.WEB_SEARCH");
        startActivity(intent);
        tvTask1.setText("Кнопка: 15");
        tvTask2.setText("Ожидаемый результат: FM частота на 100.0");
    }


    public void onClick17(View v) {
        Intent intent = new Intent("com.android.flyaudioui.volume");
        intent.putExtra("key_volume", (byte) 9);
        // стартуем сервис
        tvTask1.setText("Кнопка: 17");
        tvTask2.setText("Ожидаемый результат: ");
        sendBroadcast(intent);
    }

    public void onClick18(View v) {
        Intent intent = new Intent("com.android.flyaudioui.volume");
        intent.putExtra("key_volume", (byte) 9);
        // стартуем сервис
        tvTask1.setText("Кнопка: 18");
        tvTask2.setText("Ожидаемый результат: ");
        sendBroadcast(intent);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://ru.speedfire.broadcasttest/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://ru.speedfire.broadcasttest/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    //  Вспомогательные функции из FlyAudioVoice


}