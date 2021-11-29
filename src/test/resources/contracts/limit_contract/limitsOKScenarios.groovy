package contracts.limit_contract;

import org.springframework.cloud.contract.spec.Contract;

[
        Contract.make {
            name("")
            request {
                method POST()
                urlPath('/api/payments/limits') {
                    body([
                        "limitNo": "123",
                        "limitName" :"Singapore"
                    ])
                }

                headers {
                    contentType(applicationJson())
                    header 'Auth': $(regex("(Beaer|Horrer)"))
                }
            }


            response {
                status OK()
                body([
                        "result": $(anyNonBlankString())
                ])
            }
        }
]