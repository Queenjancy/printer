import 'dart:async';

import 'package:flutter/services.dart';

class Printer {
  static const MethodChannel _channel = const MethodChannel('snowofcat.printer');

  static Future<String> get printTicket async {
    final String version = await _channel.invokeMethod('printTicket');
    return version;
  }
}
