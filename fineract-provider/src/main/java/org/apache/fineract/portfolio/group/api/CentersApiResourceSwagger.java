/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.portfolio.group.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.Set;

/**
 * Created by Chirag Gupta on 12/18/17.
 */
final class CentersApiResourceSwagger {

    private CentersApiResourceSwagger() {}

    @ApiModel(value = "GetCentersTemplateResponse")
    public static final class GetCentersTemplateResponse {

        private GetCentersTemplateResponse() {}

        static final class GetCentersOfficeOptions {

            private GetCentersOfficeOptions() {}

            @ApiModelProperty(example = "1")
            public Integer id;
            @ApiModelProperty(example = "Head Office")
            public String name;
            @ApiModelProperty(example = "Head Office")
            public String nameDecorated;
        }

        static final class GetCentersStaffOptions {

            private GetCentersStaffOptions() {}

            @ApiModelProperty(example = "2")
            public Integer id;
            @ApiModelProperty(example = "D, Mary")
            public String displayName;
        }

        @ApiModelProperty(example = "false")
        public Boolean active;
        @ApiModelProperty(example = "[2013, 4, 18]")
        public LocalDate activationDate;
        @ApiModelProperty(example = "2")
        public Integer officeId;
        public Set<GetCentersOfficeOptions> officeOptions;
        public Set<GetCentersStaffOptions> staffOptions;
    }

    @ApiModel(value = "GetCentersResponse")
    public static final class GetCentersResponse {

        private GetCentersResponse() {}

        static final class GetCentersPageItems {

            private GetCentersPageItems() {}

            static final class GetCentersStatus {

                private GetCentersStatus() {}

                @ApiModelProperty(example = "100")
                public Integer id;
                @ApiModelProperty(example = "groupingStatusType.pending")
                public String code;
                @ApiModelProperty(example = "Pending")
                public String value;
            }

            @ApiModelProperty(example = "2")
            public Integer id;
            public GetCentersStatus status;
            @ApiModelProperty(example = "false")
            public Boolean active;
            @ApiModelProperty(example = "Center 1")
            public String name;
            @ApiModelProperty(example = "1")
            public Integer officeId;
            @ApiModelProperty(example = "Head Office")
            public String officeName;
            @ApiModelProperty(example = ".2.")
            public String hierarchy;
        }

        @ApiModelProperty(example = "2")
        public Integer totalFilteredRecords;
        public Set<GetCentersPageItems> pageItems;
    }

    @ApiModel(value = "GetCentersCenterIdResponse")
    public static final class GetCentersCenterIdResponse {

        private GetCentersCenterIdResponse() {}

        @ApiModelProperty(example = "8")
        public Integer id;
        public GetCentersResponse.GetCentersPageItems.GetCentersStatus status;
        @ApiModelProperty(example = "false")
        public Boolean active;
        @ApiModelProperty(example = "First Center (No groups)")
        public String name;
        @ApiModelProperty(example = "1")
        public Integer officeId;
        @ApiModelProperty(example = "Head Office")
        public String officeName;
        @ApiModelProperty(example = ".8.")
        public String hierarchy;
    }

    @ApiModel(value = "PostCentersRequest")
    public static final class PostCentersRequest {

        private PostCentersRequest() {}

        @ApiModelProperty(example = "First Center (No groups)")
        public String name;
        @ApiModelProperty(example = "1")
        public Integer officeId;
        @ApiModelProperty(example = "false")
        public Boolean active;
    }

    @ApiModel(value = "PostCentersResponse")
    public static final class PostCentersResponse {

        private PostCentersResponse() {}

        @ApiModelProperty(example = "1")
        public Integer officeId;
        @ApiModelProperty(example = "8")
        public Integer groupId;
        @ApiModelProperty(example = "8")
        public Integer resourceId;
    }

    @ApiModel(value = "PutCentersCenterIdRequest")
    public static final class PutCentersCenterIdRequest {

        private PutCentersCenterIdRequest() {}

        @ApiModelProperty(example = "First Center (No groups)")
        public String name;
    }

    @ApiModel(value = "PutCentersCenterIdResponse")
    public static final class PutCentersCenterIdResponse {

        private PutCentersCenterIdResponse() {}

        static final class PutCentersChanges {

            private PutCentersChanges() {}

            @ApiModelProperty(example = "First Center (No groups) - modified")
            public String name;
        }

        @ApiModelProperty(example = "1")
        public Integer officeId;
        @ApiModelProperty(example = "8")
        public Integer groupId;
        @ApiModelProperty(example = "8")
        public Integer resourceId;
        public PutCentersChanges changes;
    }

    @ApiModel(value = "DeleteCentersCenterIdResponse")
    public static final class DeleteCentersCenterIdResponse {

        private DeleteCentersCenterIdResponse() {}

        static final class DeleteCentersChanges {

            private DeleteCentersChanges() {}
        }

        @ApiModelProperty(example = "1")
        public Integer resourceId;
        public DeleteCentersChanges changes;
    }

    @ApiModel(value = "PostCentersCenterIdRequest")
    public static final class PostCentersCenterIdRequest {

        private PostCentersCenterIdRequest() {}

        @ApiModelProperty(example = "32")
        public Integer closureReasonId;
        @ApiModelProperty(example = "05 May 2014")
        public String closureDate;
        @ApiModelProperty(example = "en")
        public String locale;
        @ApiModelProperty(example = "dd MMMM yyyy")
        public String dateFormat;
    }

    @ApiModel(value = "PostCentersCenterIdResponse")
    public static final class PostCentersCenterIdResponse {

        private PostCentersCenterIdResponse() {}

        @ApiModelProperty(example = "1")
        public Integer resourceId;
    }

    @ApiModel(value = "GetCentersCenterIdAccountsResponse")
    public static final class GetCentersCenterIdAccountsResponse {

        private GetCentersCenterIdAccountsResponse() {}

        static final class GetCentersSavingsAccounts {

            private GetCentersSavingsAccounts() {}

            static final class GetCentersCenterIdStatus {

                private GetCentersCenterIdStatus() {}

                @ApiModelProperty(example = "100")
                public Integer id;
                @ApiModelProperty(example = "savingsAccountStatusType.submitted.and.pending.approval")
                public String code;
                @ApiModelProperty(example = "Submitted and pending approval")
                public String value;
                @ApiModelProperty(example = "true")
                public Boolean submittedAndPendingApproval;
                @ApiModelProperty(example = "false")
                public Boolean approved;
                @ApiModelProperty(example = "false")
                public Boolean rejected;
                @ApiModelProperty(example = "false")
                public Boolean withdrawnByApplicant;
                @ApiModelProperty(example = "false")
                public Boolean active;
                @ApiModelProperty(example = "false")
                public Boolean closed;
                @ApiModelProperty(example = "false")
                public Boolean prematureClosed;
                @ApiModelProperty(example = "false")
                public Boolean transferInProgress;
                @ApiModelProperty(example = "false")
                public Boolean transferOnHold;
            }

            static final class GetCentersCenterIdCurrency {

                private GetCentersCenterIdCurrency() {}

                @ApiModelProperty(example = "USD")
                public String code;
                @ApiModelProperty(example = "US Dollar")
                public String name;
                @ApiModelProperty(example = "2")
                public Integer decimalPlaces;
                @ApiModelProperty(example = "0")
                public Integer inMultiplesOf;
                @ApiModelProperty(example = "$")
                public String displaySymbol;
                @ApiModelProperty(example = "currency.USD")
                public String nameCode;
                @ApiModelProperty(example = "US Dollar ($)")
                public String displayLabel;
            }

            static final class GetCentersAccountType {

                private GetCentersAccountType() {}

                @ApiModelProperty(example = "2")
                public Integer id;
                @ApiModelProperty(example = "accountType.group")
                public String code;
                @ApiModelProperty(example = "Group")
                public String value;
            }

            static final class GetCentersTimeline {

                private GetCentersTimeline() {}

                @ApiModelProperty(example = "[2014, 5, 1]")
                public LocalDate submittedOnDate;
                @ApiModelProperty(example = "mifos")
                public String submittedByUsername;
                @ApiModelProperty(example = "App")
                public String submittedByFirstname;
                @ApiModelProperty(example = "Administrator")
                public String submittedByLastname;
            }

            static final class GetCentersDepositType {

                private GetCentersDepositType() {}

                @ApiModelProperty(example = "100")
                public Integer id;
                @ApiModelProperty(example = "depositAccountType.savingsDeposit")
                public String code;
                @ApiModelProperty(example = "Savings")
                public String value;
            }

            @ApiModelProperty(example = "16")
            public Integer id;
            @ApiModelProperty(example = "000000016")
            public Long accountNo;
            @ApiModelProperty(example = "1")
            public Integer productId;
            @ApiModelProperty(example = "Voluntary savings")
            public String productName;
            public GetCentersCenterIdStatus status;
            public GetCentersCenterIdCurrency currency;
            public GetCentersAccountType accountType;
            public GetCentersTimeline timeline;
            public GetCentersDepositType depositType;
        }

        public Set<GetCentersSavingsAccounts> savingsAccounts;
    }
}
