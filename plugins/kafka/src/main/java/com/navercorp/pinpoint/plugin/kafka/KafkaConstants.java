/*
 * Copyright 2018 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.plugin.kafka;

import com.navercorp.pinpoint.common.trace.AnnotationKey;
import com.navercorp.pinpoint.common.trace.AnnotationKeyFactory;
import com.navercorp.pinpoint.common.trace.ServiceType;
import com.navercorp.pinpoint.common.trace.ServiceTypeFactory;
import com.navercorp.pinpoint.plugin.kafka.field.accessor.RemoteAddressFieldAccessor;

import static com.navercorp.pinpoint.common.trace.AnnotationKeyProperty.VIEW_IN_RECORD_SET;
import static com.navercorp.pinpoint.common.trace.ServiceTypeProperty.QUEUE;
import static com.navercorp.pinpoint.common.trace.ServiceTypeProperty.RECORD_STATISTICS;

public class KafkaConstants {

    public static final ServiceType KAFKA_CLIENT = ServiceTypeFactory.of(8660, "KAFKA_CLIENT", "KAFKA_CLIENT", QUEUE, RECORD_STATISTICS);
    public static final ServiceType KAFKA_CLIENT_INTERNAL = ServiceTypeFactory.of(8661, "KAFKA_CLIENT_INTERNAL", "KAFKA_CLIENT");

    public static final AnnotationKey KAFKA_TOPIC_ANNOTATION_KEY = AnnotationKeyFactory.of(140, "kafka.topic", VIEW_IN_RECORD_SET);
    public static final AnnotationKey KAFKA_PARTITION_ANNOTATION_KEY = AnnotationKeyFactory.of(141, "kafka.partition", VIEW_IN_RECORD_SET);
    public static final AnnotationKey KAFKA_OFFSET_ANNOTATION_KEY = AnnotationKeyFactory.of(142, "kafka.offset", VIEW_IN_RECORD_SET);

    public static final String REMOTE_ADDRESS_ACCESSOR = RemoteAddressFieldAccessor.class.getName();

    public static final String PRODUCER_CONSTRUCTOR_INTERCEPTOR = "com.navercorp.pinpoint.plugin.kafka.interceptor.ProducerConstructorInterceptor";
    public static final String PRODUCER_SEND_INTERCEPTOR = "com.navercorp.pinpoint.plugin.kafka.interceptor.ProducerSendInterceptor";

    public static final String CONSUMER_CONSTRUCTOR_INTERCEPTOR = "com.navercorp.pinpoint.plugin.kafka.interceptor.ConsumerConstructorInterceptor";

    public static final String CONSUMER_POLL_INTERCEPTOR = "com.navercorp.pinpoint.plugin.kafka.interceptor.ConsumerPollInterceptor";

    public static final String CONSUMER_RECORD_ENTRYPOINT_INTERCEPTOR = "com.navercorp.pinpoint.plugin.kafka.interceptor.ConsumerRecordEntryPointInterceptor";

    public static final String CONSUMER_RECORD_CLASS_NAME = "org.apache.kafka.clients.consumer.ConsumerRecord";

    public static final String UNKNOWN = "Unknown";

}
