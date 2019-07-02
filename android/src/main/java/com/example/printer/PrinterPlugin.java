package com.example.printer;

import android.os.RemoteException;

import com.sunmi.peripheral.printer.InnerPrinterCallback;
import com.sunmi.peripheral.printer.InnerPrinterException;
import com.sunmi.peripheral.printer.InnerPrinterManager;
import com.sunmi.peripheral.printer.InnerResultCallbcak;
import com.sunmi.peripheral.printer.SunmiPrinterService;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/** PrinterPlugin */
public class PrinterPlugin implements MethodCallHandler {
  /** Plugin registration. */
  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "snowofcat.printer");
    channel.setMethodCallHandler(new PrinterPlugin());
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    if (call.method.equals("printTicket")) {
      /*
      try {
        InnerPrinterCallback innerPrinterCallback = new InnerPrinterCallback() {
          @Override
          protected void onConnected(SunmiPrinterService service) {
            try {
              service.printText("打印小票\n打印小票\n打印小票\n打印小票", new InnerResultCallbcak() {
                @Override
                public void onRunResult(boolean isSuccess) throws RemoteException {
                  System.out.println("success");
                }

                @Override
                public void onReturnString(String result) throws RemoteException {
                  System.out.println("result");
                }

                @Override
                public void onRaiseException(int code, String msg) throws RemoteException {
                  System.out.println("raise");
                }

                @Override
                public void onPrintResult(int code, String msg) throws RemoteException {
                  System.out.println("print result");
                }
              });
            } catch (RemoteException e) {
              e.printStackTrace();
            }
          }

          @Override
          protected void onDisconnected() {
            System.out.println("断开了");
          }
        };
        InnerPrinterManager.getInstance().bindService(getApplicationContext(), innerPrinterCallback);
      } catch (InnerPrinterException e) {
        e.printStackTrace();
      }
      */
      result.success("success");
    } else {
      result.notImplemented();
    }
  }
}
