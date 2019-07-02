import 'dart:async';

import 'package:flutter/services.dart';

class Printer {
  static const MethodChannel _channel = const MethodChannel('printer');

  static Future<String> printTicket() async {
    return await _channel.invokeMethod('printTicket');
  }
}
