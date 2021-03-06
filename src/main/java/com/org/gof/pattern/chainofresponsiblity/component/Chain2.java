package com.org.gof.pattern.chainofresponsiblity.component;

public class Chain2 extends Chain {
    @Override
    public void handle(RequestModel requestModel) {
        if (VacationRequestModel.VACATION_TYPE.equals(requestModel.getType())){
            handleVacationApproval(requestModel);
        } else if (RaiseRequestModel.RAISE_TYPE.equals(requestModel.getType())){
            handleSalaryRaise(requestModel);
        } else {
            System.out.println("Can't handle this request type");
        }
    }

    private void handleSalaryRaise(RequestModel requestModel){
        RaiseRequestModel model = (RaiseRequestModel) requestModel;
        if (model.getAmount() <= 300) {
            System.out.println("handled by chain2 with request type " + requestModel.getType());
        } else if (successor != null) {
            successor.handle(requestModel);
        } else {
            System.out.println("no one to handle this request");
        }
    }

    private void handleVacationApproval(RequestModel requestModel){
        VacationRequestModel model = (VacationRequestModel) requestModel;
        if (model.getDays() <= 3) {
            System.out.println("handled by chain2 with request type " + requestModel.getType());
        } else if (successor != null) {
            successor.handle(requestModel);
        } else {
            System.out.println("no one to handle this request");
        }
    }

}
